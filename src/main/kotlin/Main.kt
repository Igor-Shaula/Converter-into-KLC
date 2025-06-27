package org.igor_shaula

import java.io.File
import java.text.NumberFormat.Field.PREFIX
import kotlin.system.exitProcess

private var isInsideLanguageBlock = false

fun main(args: Array<String>) {

    val filename = if (args.isEmpty()) {
        LOCATION_OF_SYMBOLS_US_FILE
    } else {
        args[0]
    }

    val symbolsDictionaryFile = File(LOCATION_OF_KEYSYMDEF_FILE)

    try {
        symbolsDictionaryFile.useLines { lines ->
            lines.forEach {
                val pair = parseKeySymDefinition(it)
                if (pair != null) symbolsDictionary.put(pair.first, pair.second)
            }
        }
        println("Symbols dictionary: $symbolsDictionary")
        File(filename).useLines { lines ->
            lines.forEach { processEveryLine(it.normalize()) }
        }
        println("essence: $x11Essence")
        x11Essence.map { (key, value) -> windowsEssence.put(xkbToWindowsScancode[key], value) }
        println("windowsEssence: $windowsEssence")
        composeKLC()
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}

private fun processEveryLine(line: String) {
    // 0
    if (isXkbSymbolsSection(line)) {
        println("isXkbSymbolsSection")
        isInsideLanguageBlock = true
    } else if (isLayoutEndingBlock(line)) {
        println("isLayoutEndingBlock")
        isInsideLanguageBlock = false
    }
    // any recognition action outside a detected layout block has no sense
    if (!isInsideLanguageBlock) return

    // 1
    if (isEnglishUSNameGroup1(line)) {
        // start looking for keys
        println("isInsideLanguageBlock → true")
    } else {
        println(line)
    }
    // 2
    if (isInsideLanguageBlock) {
        if (isKeyTilde(line)) {
            val layers = createValuesForLayers(line)
            x11Essence.put("TLDE", layers)
            println("→ isKeyTilde: $layers")
        } else if (isKeySpace(line)) {
            val layers = createValuesForLayers(line)
            x11Essence.put("SPCE", layers)
            println("→ isKeySpace: $layers")
        } else if (isKeyStartingWithA(line)) {
            val layers = createValuesForLayers(line)
            x11Essence.put(line.getKeyNameStartingWithA(), layers)
            println("→ isKeyStartingWithA: $layers")
        }
    }
}

fun composeKLC() {
    val resultFile = File("result.klc")
    resultFile.writeText(KLC_FILE_PREFIX)
    windowsEssence.forEach { (key, value) ->
        val scValue = key
        val vkValue = getVkValueByScValue(key)
        val capitalized = getCapitalized(vkValue ?: NOSYMBOL)
        val (layer1, layer2, layer3, layer4) = value
        resultFile.appendText("$scValue\t$vkValue\t$capitalized\t$layer1\t$layer2\t-1\t$layer3\t$layer4\n")
    }
    resultFile.appendText(KLC_FILE_SUFFIX)
    println("resultFile: $resultFile")
}
