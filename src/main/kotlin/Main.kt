package org.igor_shaula

import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val filename = if (args.isEmpty()) {
        "/usr/share/X11/xkb/symbols/us"
    } else {
        args[0]
    }

    try {
        File(filename).useLines { lines ->
            lines.forEach { line ->
                println(line)
            }
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}