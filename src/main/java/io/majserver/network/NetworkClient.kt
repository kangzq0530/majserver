package io.majserver.network

import io.majserver.network.proto.*
import io.majserver.network.proto.ProtoBuf
import kotlinx.io.ByteArrayOutputStream
import kotlinx.serialization.ImplicitReflectionSerializer
import org.java_websocket.WebSocket
import org.slf4j.LoggerFactory
import java.nio.ByteBuffer

val log = LoggerFactory.getLogger("NetworkClient")

class NetworkClient(
        val socket: WebSocket
) {

    fun onOpen() {

    }

    fun onClose() {

    }

    @ImplicitReflectionSerializer
    fun onMessage(buffer: ByteBuffer) {
        when (val type = buffer.get().toInt()) {
            1 -> {
                val index1 = buffer.get()
                val index2 = buffer.get()
                val data = ByteArray(buffer.remaining()).apply { buffer.get(this) }
                val wrapper = ProtoBuf.load(Wrapper.serializer(), data)
                val handler = Handlers.handlers[wrapper.name]
                if (handler == null) {
                    log.warn("Unhandled rpc: ${wrapper.name}")
                    return
                }
                val res = handler.handle(wrapper.data)
                socket.send(ByteArrayOutputStream().apply {
                    write(3)
                    write(index1.toInt())
                    write(index2.toInt())
                    write(wrap(wrapper.name!!, res).serialize())
                }.toByteArray())
            }
        }
    }
}

