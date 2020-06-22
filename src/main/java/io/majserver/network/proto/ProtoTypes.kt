package io.majserver.network.proto

import io.majserver.network.Handlers.handlers

interface IProtoMessage {
    fun encode() : ByteArray
    fun wrap() : Wrapper
}

abstract class IProtoRpc<Req : IProtoMessage, Res : IProtoMessage>(
        val name: String
) {
    protected lateinit var callable: (req: Req) -> Res

    abstract fun decodeReq(data: ByteArray): Req

    fun handle(array: ByteArray): Res {
        return callable(decodeReq(array))
    }

    operator fun invoke(callable: (req: Req) -> Res) {
        this.callable = callable
        handlers[this.name] = this
    }
}
