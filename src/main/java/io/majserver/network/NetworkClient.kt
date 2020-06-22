package io.majserver.network

import io.majserver.network.proto.*
import io.majserver.network.proto.ProtoBuf
import org.java_websocket.WebSocket
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

val log: Logger = LoggerFactory.getLogger("NetworkClient")

typealias MessageType = Byte

const val Null: MessageType = 0
const val Notify: MessageType = 1
const val Request: MessageType = 2
const val Response: MessageType = 3

class NetworkClient(
        val socket: WebSocket
) {

    fun onOpen() {

    }

    fun onClose() {

    }

    fun onMessage(buffer: ByteBuffer) {
        when (buffer.get()) {
            Request -> {
                val index1 = buffer.get()
                val index2 = buffer.get()
                val data = ByteArray(buffer.remaining()).apply { buffer.get(this) }
                val wrapper = unwrap(data)
                val handler = Handlers.handlers[wrapper.name]
                if (handler == null) {
                    log.warn("Unhandled rpc: ${wrapper.name}")
                    return
                }
                log.info("rpc: ${wrapper.name}")
                val res = handler.handle(wrapper.data)
                socket.send(ByteArrayOutputStream().apply {
                    write(Response.toInt())
                    write(index1.toInt())
                    write(index2.toInt())
                    write(wrap(wrapper.name!!, res))
                }.toByteArray())
            }
        }
    }

    private fun wrap(name: String, data: ByteArray): ByteArray {
        return ProtoBuf.dump(Wrapper.serializer(), Wrapper(name, data))
    }

    private fun unwrap(data: ByteArray): Wrapper {
        return ProtoBuf.load(Wrapper.serializer(), data)
    }
}

