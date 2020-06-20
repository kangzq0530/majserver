package io.majserver.network

import io.majserver.network.proto.*

object Handlers {
    @JvmStatic
    val handlers = mutableMapOf<String, IProtoRpc<out IProtoMessage, out IProtoMessage>>()

    @JvmStatic
    fun registerHandlers() {
        val rpc = Lobby.Login {
            println(it)
            ResLogin(
                    access_token = it.password
            )
        }
        handlers[rpc.name] = rpc
    }

}