package org.igor_shaula

import java.io.File
import kotlin.system.exitProcess

private var isInsideLanguageBlock = false

fun main(args: Array<String>) {

    val filename = if (args.isEmpty()) {
        LOCATION_OF_SYMBOLS_US_FILE
    } else {
        args[0]
    }

    try {
        File(filename).useLines { lines ->
            lines.forEach { processEveryLine(it.normalize()) }
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}

private fun processEveryLine(line: String) {
    // 1
    if (isEnglishUSNameGroup1(line)) {
        // start looking for keys
        isInsideLanguageBlock = true
        println("isInsideLanguageBlock → true")
    } else {
        println(line)
    }
    // 2
    if (isInsideLanguageBlock) {
        if (isKeyTilde(line)) println("→ isKeyTilde")
        else if (isKeyStartingWithA(line)) println("→ isKeyStartingWithA")
    }
}
