package io.majserver.network

import io.majserver.network.proto.ProtoBuf
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationStrategy
import org.java_websocket.WebSocket
import org.java_websocket.handshake.ClientHandshake
import java.net.InetSocketAddress
import java.nio.ByteBuffer


fun main() {
    Handlers.registerHandlers()
    val host = "localhost"
    val port = 8887
    val server = WebSocketServer(InetSocketAddress(host, port))
    server.run()
}

class WebSocketServer(address: InetSocketAddress?) : org.java_websocket.server.WebSocketServer(address) {
    override fun onOpen(conn: WebSocket, handshake: ClientHandshake) {
        val client = NetworkClient(conn)
        conn.setAttachment(client)
        client.onOpen()
        println("new connection to " + conn.getRemoteSocketAddress())
    }

    override fun onClose(conn: WebSocket, code: Int, reason: String, remote: Boolean) {
        conn.getAttachment<NetworkClient>().onClose()
        conn.setAttachment(null)
        println("closed " + conn.getRemoteSocketAddress().toString() + " with exit code " + code.toString() + " additional info: " + reason)
    }

    override fun onMessage(conn: WebSocket, message: String) {
    }

    override fun onMessage(conn: WebSocket, message: ByteBuffer) {
        conn.getAttachment<NetworkClient>().onMessage(message)
    }

    override fun onError(conn: WebSocket, ex: Exception) {
    }

    override fun onStart() {
        println("server started successfully")
    }
}