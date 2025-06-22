package org.igor_shaula

import java.io.File
import kotlin.system.exitProcess

private var isInsideLanguageBlock = false

// Example usage in main:
fun main(args: Array<String>) {
    val filename = if (args.isEmpty()) {
        "/usr/share/X11/xkb/symbols/us"
    } else {
        args[0]
    }

    try {
        File(filename).useLines { lines ->
            lines.forEach { line ->
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
                    if (isKeyTilda(line)) println("isKeyTilda")
                    else if (isKeyStartingWithA(line)) println("isKeyStartingWithA")
                }
            }
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}