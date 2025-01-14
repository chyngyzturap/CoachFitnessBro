@file:Suppress("unused")

package com.pharos.logger

object Logger {
    private var enable: Boolean = true
    private val enabled: MutableMap<LogType, Boolean> = mutableMapOf(
        LogType.MVI to true,
        LogType.NETWORK to true,
        LogType.OTHER to true,
    )

    fun disable(type: LogType) {
        enabled[type] = false
    }

    fun enable(type: LogType) {
        enabled[type] = true
    }

    fun getEnable(type: LogType): Boolean = enabled[type] ?: false

    fun init(
        mvi: Boolean = true,
        network: Boolean = true,
        other: Boolean = true,
    ) {
        enabled[LogType.MVI] = mvi
        enabled[LogType.NETWORK] = network
        enabled[LogType.OTHER] = other
    }

    fun log(message: String, tag: String = "", type: LogType = LogType.OTHER) {
        if (!enable) return
        if (enabled[type] == false) return
        platformLog(
            tag = "${type.name}_$tag",
            message = message,
        )
    }
}
