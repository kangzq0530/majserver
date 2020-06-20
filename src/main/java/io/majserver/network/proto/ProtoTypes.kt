package io.majserver.network.proto

import io.majserver.network.Handlers.handlers
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.dump
import kotlinx.serialization.load

interface IProtoMessage {
    @OptIn(ImplicitReflectionSerializer::class)
    fun serialize(): ByteArray = ProtoBuf.dump(this)
}

abstract class IProtoRpc<Req: IProtoMessage, Res: IProtoMessage>(
        val name: String,
        val callable: (req: Req) -> Res
) {
    abstract fun decodeReq(data: ByteArray) : Req
    abstract fun encodeRes(res: Res) : ByteArray
    fun handle(array: ByteArray) : ByteArray {
        val req = decodeReq(array)
        val res = callable(req)
        return encodeRes(res)
    }
    init {
        handlers[this.name] = this
    }
}

@OptIn(ImplicitReflectionSerializer::class)
inline fun <reified T: IProtoMessage> unwrap(wrapper: Wrapper) : T {
    return ProtoBuf.load(wrapper.data)
}