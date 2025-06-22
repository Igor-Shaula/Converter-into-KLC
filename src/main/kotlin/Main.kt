package org.igor_shaula

import java.io.File
import kotlin.system.exitProcess

fun isEnglishUSNameGroup1(line: String): Boolean {
    // Remove all whitespace and then compare with the normalized pattern
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine == """name[Group1]="English(US)";"""
}

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
                if (isEnglishUSNameGroup1(line)) {
                    println("Found the English (US) Group1 name declaration!")
                }
                println(line)
            }
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}