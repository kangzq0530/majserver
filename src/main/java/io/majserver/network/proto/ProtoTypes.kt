package io.majserver.network.proto

import io.majserver.network.Handlers
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
    fun handle(array: ByteArray) : Res {
        val req = decodeReq(array)
        return callable(req)
    }
    init {
        Handlers.register(this)
    }
}

inline fun <reified T :IProtoMessage> wrap(name: String, message: T): Wrapper {
    return Wrapper(name, message.serialize())
}

@OptIn(ImplicitReflectionSerializer::class)
inline fun <reified T: IProtoMessage> unwrap(wrapper: Wrapper) : T {
    return ProtoBuf.load(wrapper.data)
}