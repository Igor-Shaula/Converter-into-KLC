package org.igor_shaula.logic.io

import org.igor_shaula.utils.l

object ArgumentsProcessor {

    var isLoggingAllowed = true
        private set

    // this function is intended to be invoked first - right after the program starts
    fun processArguments(args: Array<String>?) {
        args?.forEach { oneArg ->
            if (oneArg.startsWith("-")) when (oneArg.substring(1)) {
                "v" -> isLoggingAllowed = true // verbose mode
                "s" -> isLoggingAllowed = false // silent mode
            }
        }
        l("args: ${args?.joinToString(", ")}")
    }
}