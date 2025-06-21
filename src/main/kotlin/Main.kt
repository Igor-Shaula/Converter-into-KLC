package org.igor_shaula

import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        System.err.println("Error: No input file specified")
        System.err.println("Usage: program <filename>")
        exitProcess(1)
    }

    val filename = args[0]

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