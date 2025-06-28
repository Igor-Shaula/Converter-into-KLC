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

    val symbolsDictionaryFile = File(LOCATION_OF_KEYSYMDEF_FILE)

    try {
        symbolsDictionaryFile.useLines { lines ->
            lines.forEach {
                val pair = parseKeySymDefinition(it)
                if (pair != null) symbolsDictionary.put(pair.first, pair.second)
            }
        }
        println("standard Linux symbols dictionary: $symbolsDictionary")
        File(filename).useLines { lines ->
            lines.forEach { processEveryLine(it.normalize()) } // in result x11Essence is filled with actual data
        }
        println("x11Essence: $x11Essence")
        x11Essence.map { (key, value) -> windowsEssence.put(xkbToWindowsScancode[key], value) }
        println("windowsEssence: $windowsEssence")
        composeKlcFile()
    } catch (e: Exception) {
        System.err.println("Error reading file '$filename': ${e.message}")
        exitProcess(1)
    }
}

private fun processEveryLine(line: String) {
    // 0
    if (getXkbSymbolsSectionName(line) == DEFAULT_XKB_LAYOUT) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
        println("getXkbSymbolsSectionName: $DEFAULT_XKB_LAYOUT")
        isInsideLanguageBlock = true
    } else if (isInsideLanguageBlock && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
        println("isLayoutEndingBlock")
        isInsideLanguageBlock = false
    }
    if (!isInsideLanguageBlock) { // saving a lot of time and resources on processing the apriori invalid line
        return // because any further recognition action outside a detected layout block has no sense
    }
    // 1
    when {
        isKeyStartingWithA(line) -> {
            val layers = createValuesForLayers(line)
            x11Essence.put(line.getKeyNameStartingWithA(), layers)
            println("→ isKeyStartingWithA: $layers")
        }
        isKeyTilde(line) -> {
            val layers = createValuesForLayers(line)
            x11Essence.put(X11_NAME_TILDE, layers)
            println("→ isKeyTilde: $layers")
        }
        isKeySpace(line) -> {
            val layers = createValuesForLayers(line)
            x11Essence.put(X11_NAME_SPACE, layers)
            println("→ isKeySpace: $layers")
        }
    }
}

fun composeKlcFile() {
    val resultFile = File("result_UTF-16.klc")
    resultFile.writeText(KLC_FILE_PREFIX, charset = Charsets.UTF_16)
    windowsEssence.forEach { (key, value) ->
        val scValue = key?.lowercase()
        val vkValue = getVkValueByScValue(key?.lowercase()) ?: value.layer1.uppercase()
        val capitalized = getCapitalized(vkValue)
        val (layer1, layer2, layer3, layer4) = value.adaptForWindows()
        resultFile.appendText(
            "$scValue\t$vkValue\t$capitalized\t$layer1\t$layer2\t-1\t$layer3\t$layer4\n", charset = Charsets.UTF_16
        )
    }
    resultFile.appendText(KLC_FILE_SUFFIX, charset = Charsets.UTF_16)
    println("resultFile: $resultFile")
}
