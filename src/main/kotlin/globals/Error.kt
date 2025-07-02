package org.igor_shaula.globals

sealed class Error : Throwable() {

    data class WithFile(val filename: String, override val message: String) : Error()

    data class WithParsing(override val message: String) : Error()
}