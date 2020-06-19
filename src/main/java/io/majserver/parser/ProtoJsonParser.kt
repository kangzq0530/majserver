package io.majserver.parser

import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.*
import kotlinx.serialization.protobuf.ProtoBuf
import java.io.File


fun main() {
    val json = Json(JsonConfiguration.Default).parseJson(File("majsoul/liqi.json").readBytes().toString(Charsets.UTF_8))
    val elements = json.jsonObject.getObject("nested").getObject("lq").getObject("nested")
    val nested = parseNested(elements)
    val protoPackage = ProtoPackage("lq")
    protoPackage.parse(elements)
    File("src/main/java/lq/lq.kt").writeText(protoPackage.ktString)
}

fun parseNested(json: JsonObject): List<ProtoContainer> {
    return json.entries.map {
        val container = if (it.value.contains("methods")) {
            // service
            ProtoService(it.key)
        } else {
            // message
            ProtoMessage(it.key)
        }
        container.parse(it.value.jsonObject)
        return@map container
    }
}

sealed class ProtoEntity(val name: String) {
    abstract val ktString: String
}

sealed class ProtoContainer(name: String) : ProtoEntity(name) {
    val elements: List<ProtoEntity> = mutableListOf()
    val nested: List<ProtoContainer> = mutableListOf()
    abstract fun parse(json: JsonObject)
}

class ProtoMessage(name: String) : ProtoContainer(name) {
    override fun parse(json: JsonObject) {
        json.getObjectOrNull("nested")?.apply {
            (nested as MutableList).addAll(parseNested(this))
        }
        json.getObjectOrNull("fields")?.apply {
            val fields = entries.map {
                ProtoField(
                        name = it.key,
                        type = it.value.jsonObject["type"]!!.content,
                        id = it.value.jsonObject["id"]!!.int,
                        rule = it.value.jsonObject["rule"]?.contentOrNull ?: ""
                )
            }
            (elements as MutableList).addAll(fields)
        }
    }

    override val ktString: String
        get() = StringBuilder().apply {
            append("@Serializable \nclass $name (")
            if (elements.isNotEmpty()) {
                var first = true
                elements.forEach {
                    if (!first) {
                        append(",")
                    }
                    appendln().append("    ")
                    append(it.ktString)
                    first = false
                }
                appendln()
            }
            append(")")

            if (nested.isNotEmpty()) {
                append(" {").appendln()
                nested.forEach {
                    appendln(it.ktString).appendln()
                }
                append("}")
            }
        }.toString()
}

class ProtoField(name: String, val type: String, val id: Int, val rule: String = "") : ProtoEntity(name) {

    override val ktString: String
        get() = "@ProtoId($id) @JvmField val ${formatName(name)}: ${formatTypeWithValue(type, rule)}"
}

fun formatName(name: String): String {
    return when (name) {
        "val", "package" -> "`$name`"
        else -> name
    }
}

fun formatTypeWithValue(type: String, rule: String): String {
    val isRepeated = rule == "repeated"
    return when (type) {
        "string" -> "String? = null"
        "bytes" -> "ByteArray = EMPTY_BYTE_ARRAY"
        "bool" -> "Boolean = false"
        "float" -> "Float = 0f"
        "uint32", "int32" -> if (isRepeated) "List<Int> = emptyList()" else "Int = 0"
        else -> if (isRepeated) "List<$type> = emptyList()" else "$type? = null"
    }
}

class ProtoRpc(name: String, val requestType: String, val responseType: String) : ProtoEntity(name) {
    override val ktString: String
        get() = "fun $name(req: $requestType) : $responseType"
}

class ProtoService(name: String) : ProtoContainer(name) {
    override fun parse(json: JsonObject) {
        json.getObjectOrNull("methods")?.apply {
            val elements = entries.map {
                ProtoRpc(
                        name = it.key,
                        requestType = it.value.jsonObject["requestType"]!!.content,
                        responseType = it.value.jsonObject["responseType"]!!.content
                )
            }
            (this@ProtoService.elements as MutableList).addAll(elements)
        }
    }

    override val ktString: String
        get() = StringBuilder().apply {
            appendln("interface $name {")
            elements.forEach { append("    ").appendln(it.ktString) }
            append("}")
        }.toString()
}

class ProtoPackage(name: String) : ProtoContainer(name) {
    override fun parse(json: JsonObject) {
        (nested as MutableList).addAll(parseNested(json))
    }

    override val ktString: String
        get() = StringBuilder().apply {
            appendln("package $name")
            appendln()
            appendln("import kotlinx.serialization.Serializable")
            appendln("import kotlinx.serialization.protobuf.ProtoId")
            appendln()
            appendln("val EMPTY_BYTE_ARRAY = ByteArray(0)")
            appendln()
            nested.forEach {
                appendln(it.ktString).appendln()
            }
        }.toString()
}


