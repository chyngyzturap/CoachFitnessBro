package com.pharos.logger

actual fun platformLog(tag: String, message: String) {
    println("$tag $message")
}
