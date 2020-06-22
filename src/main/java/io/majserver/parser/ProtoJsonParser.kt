package io.majserver.parser

import kotlinx.serialization.json.*
import java.io.File

const val PackageName = "lq"
var globalLinePrefix = 0

fun main() {
    val json = Json.parseJson(File("majsoul/liqi.json").readBytes().toString(Charsets.UTF_8))
    val elements = json.jsonObject.getObject("nested").getObject(PackageName).getObject("nested")
    val nested = parseNested(elements)
    val protoPackage = ProtoPackage(PackageName)
    protoPackage.parse(elements)
    File("src/main/java/io/majserver/network/proto/Models.kt").writeText(protoPackage.ktString)
}

private fun parseNested(json: JsonObject): List<ProtoContainer> {
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

private sealed class ProtoEntity(val name: String) {
    abstract val ktString: String
}

private sealed class ProtoContainer(name: String) : ProtoEntity(name) {
    val elements: List<ProtoEntity> = mutableListOf()
    val nested: List<ProtoContainer> = mutableListOf()
    abstract fun parse(json: JsonObject)
}

private class ProtoMessage(name: String) : ProtoContainer(name) {
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
            repeat(globalLinePrefix) { append("    ") }
            append("@Serializable ${if (elements.isNotEmpty()) "data " else ""}class $name (")
            globalLinePrefix++
            if (elements.isNotEmpty()) {
                var first = true
                elements.forEach {
                    if (!first) {
                        append(",")
                    }
                    appendLine()
                    repeat(globalLinePrefix) { append("    ") }
                    append(it.ktString)
                    first = false
                }
                appendLine()
            }
            globalLinePrefix--
            repeat(globalLinePrefix) { append("    ") }
            append(") : IProtoMessage {").appendLine()
            globalLinePrefix++
            repeat(globalLinePrefix) { append("    ") }
            append("override fun encode() = ProtoBuf.dump(serializer(), this)").appendLine()
            repeat(globalLinePrefix) { append("    ") }
            append("override fun wrap() = Wrapper(\".lq.$name\", encode())").appendLine()
            if (nested.isNotEmpty()) {
                nested.forEach {
                    appendLine().appendLine(it.ktString).appendLine()
                }
            }
            globalLinePrefix--
            repeat(globalLinePrefix) { append("    ") }
            append("}")
        }.toString()
}

private class ProtoField(name: String, val type: String, val id: Int, val rule: String = "") : ProtoEntity(name) {

    override val ktString: String
        get() = "@ProtoId($id) @JvmField val ${formatName(name)}: ${formatTypeWithValue(type, rule)}"
}

private fun formatName(name: String): String {
    return when (name) {
        "val", "package" -> "`$name`"
        else -> name
    }
}

private fun formatTypeWithValue(type: String, rule: String): String {
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

private class ProtoRpc(methodName: String, val serviceName: String, val requestType: String, val responseType: String) : ProtoEntity(methodName) {
    override val ktString: String
        get() = """object ${name[0].toUpperCase() + name.substring(1)}: IProtoRpc<$requestType, $responseType>(".$PackageName.$serviceName.$name") {
        override fun decodeReq(data: ByteArray) = ProtoBuf.load($requestType.serializer(), data)
    }"""
}

private class ProtoService(name: String) : ProtoContainer(name) {
    override fun parse(json: JsonObject) {
        json.getObjectOrNull("methods")?.apply {
            val elements = entries.map {
                ProtoRpc(
                        methodName = it.key,
                        serviceName = name,
                        requestType = it.value.jsonObject["requestType"]!!.content,
                        responseType = it.value.jsonObject["responseType"]!!.content
                )
            }
            (this@ProtoService.elements as MutableList).addAll(elements)
        }
    }

    override val ktString: String
        get() = StringBuilder().apply {
            appendLine("class $name {")
            elements.forEach { append("    ").appendLine(it.ktString) }
            append("}")
        }.toString()
}

private class ProtoPackage(name: String) : ProtoContainer(name) {
    override fun parse(json: JsonObject) {
        (nested as MutableList).addAll(parseNested(json))
    }

    override val ktString: String
        get() = StringBuilder().apply {
            appendLine("package io.majserver.network.proto")
            appendLine()
            appendLine("import kotlinx.serialization.Serializable")
            appendLine("import kotlinx.serialization.protobuf.ProtoId")
            appendLine()
            appendLine("val EMPTY_BYTE_ARRAY = ByteArray(0)")
            appendLine()
            nested.forEach {
                appendLine(it.ktString).appendLine()
            }
        }.toString()
}


