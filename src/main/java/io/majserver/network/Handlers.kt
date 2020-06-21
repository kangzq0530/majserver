package io.majserver.network

import io.majserver.network.handler.lobby.LoginHandler
import io.majserver.network.proto.*

object Handlers {
    @JvmStatic
    val handlers = mutableMapOf<String, IProtoRpc<out IProtoMessage, out IProtoMessage>>()

    @JvmStatic
    fun registerHandlers() {
        registerLobby()
    }

    private fun registerLobby() {
        Lobby.Heatbeat { ResCommon() }
        Lobby.Login(LoginHandler.login)
        Lobby.FetchServerTime { ResServerTime(server_time = (System.currentTimeMillis() / 1000).toInt()) }
    }

}