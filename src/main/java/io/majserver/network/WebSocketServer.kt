package io.majserver.network

import io.majserver.network.proto.ProtoBuf
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationStrategy
import org.java_websocket.WebSocket
import org.java_websocket.handshake.ClientHandshake
import java.net.InetSocketAddress
import java.nio.ByteBuffer


fun main() {
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
        println("received message from " + conn.getRemoteSocketAddress().toString() + ": " + message)
    }

    override fun onMessage(conn: WebSocket, message: ByteBuffer) {
        // decode header
        val type = message.get()

        val index = message.get() + (message.get().toInt() shl 8)
        val data = ByteArray(message.remaining())
        message.get(data)
//        val wrapper = deserialize(Wrapper.serializer(), data)
//        val reqLogin = deserialize(ReqLogin.serializer(), wrapper.data)
//
//        val resLogin = ResLogin(
//                error = Error(
//                        code = 200,
//                        u32_params = listOf(1,2),
//                        str_params = "str",
//                        json_param = """{"type":"json"}"""
//                ),
//                account_id = 123123,
//                account = Account(
//                        account_id = 123123,
//                        nickname = "nickname"
//                )
//        )
//        val resWrapper = Wrapper(wrapper.name, serialize(ResLogin.serializer(), resLogin))
//        val baos = ByteArrayOutputStream()
//        baos.write(3)
//        baos.write(index and 0xFF)
//        baos.write(index shl 8)
//        baos.write(serialize(Wrapper.serializer(), resWrapper))
//        conn.send(baos.toByteArray())
    }

    override fun onError(conn: WebSocket, ex: Exception) {
        System.err.println("Uncaught exception occurred: ")
        ex.printStackTrace()
    }

    override fun onStart() {
        println("server started successfully")
    }

    private inline fun <reified T : Any> serialize(serializer: SerializationStrategy<T>, value: T): ByteArray = ProtoBuf.dump(serializer, value)

    private inline fun <reified T : Any> deserialize(deserializer: DeserializationStrategy<T>, data: ByteArray): T = ProtoBuf.load(deserializer, data)
}