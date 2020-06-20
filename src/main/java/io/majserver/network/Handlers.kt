package io.majserver.network

import io.majserver.network.proto.*

object Handlers {
    @JvmStatic
    val handlers = mutableMapOf<String, IProtoRpc<out IProtoMessage, out IProtoMessage>>()

    @JvmStatic
    fun registerHandlers() {
        register(Lobby.Login {
            ResLogin()
        })
    }

    fun register(rpc: IProtoRpc<out IProtoMessage, out IProtoMessage>) {
        handlers[rpc.name] = rpc
    }

}