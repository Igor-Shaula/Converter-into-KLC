package org.igor_shaula.logic

import org.igor_shaula.globals.*
import java.io.File
import kotlin.system.exitProcess

internal fun prepareX11SymbolsDictionary() {
    try {
        //  this file is inevitably needed for the upcoming symbols conversion
        File(X11_LOCATION_OF_KEYSYMDEF_FILE).useLines { lines ->
            lines.forEach {
                val pair = parseKeySymDefinition(it)
                if (pair != null) x11SymbolsDictionary.put(pair.first, pair.second)
            }
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '${X11_LOCATION_OF_KEYSYMDEF_FILE}': ${e.message}")
        exitProcess(1)
    }
}

internal fun prepareX11Essence(x11LayoutSourceFilename: String) {
    try {
        File(x11LayoutSourceFilename).useLines { lines ->
            lines.forEach { processEveryLine(it.normalize()) } // in result x11Essence is filled with actual data
        }
    } catch (e: Exception) {
        System.err.println("Error reading file '$x11LayoutSourceFilename': ${e.message}")
        exitProcess(2)
    }
}

internal fun composeKlcFile() {
    val resultFile = File(KLC_DEFAULT_RESULT_FILE_NAME)
    resultFile.writeText(KLC_FILE_PREFIX.replace(LF, CR_LF), charset = Charsets.UTF_16)
    windowsEssence.forEach { (key, value) ->
        val scValue = key?.lowercase()
        val vkValue = getVkValueByScValue(key?.lowercase()) ?: (value.layer1.uppercase() + TAB)
        val capitalized = getCapitalizedValue(value.layer1)
        val (layer1, layer2, layer3, layer4) = value.adaptForWindows()
        resultFile.appendText(
            "$scValue${TAB}$vkValue${TAB}$capitalized${TAB}$layer1${TAB}$layer2${TAB}${KLC_ABSENT_SYMBOL_VALUE}${TAB}$layer3${TAB}$layer4${CR_LF}",
            charset = Charsets.UTF_16
        )
    }
    resultFile.appendText(KLC_FILE_SUFFIX.replace(LF, CR_LF), charset = Charsets.UTF_16)
    println("resultFile: $resultFile")
}

internal fun prepareWindowsEssence() {
    x11Essence.map { (key, value) -> windowsEssence.put(xkbToWindowsScancode[key], value) }
}

private fun processEveryLine(line: String) {
    // 0
    if (getXkbSymbolsSectionName(line) == X11_DEFAULT_XKB_LAYOUT) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
        println("getXkbSymbolsSectionName: $X11_DEFAULT_XKB_LAYOUT")
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
//            println("→ isKeyStartingWithA: $layers")
        }
        isKeyTilde(line) -> {
            val layers = createValuesForLayers(line)
            x11Essence.put(X11_NAME_TILDE, layers)
//            println("→ isKeyTilde: $layers")
        }
        isKeySpace(line) -> {
            val layers = createValuesForLayers(line)
            x11Essence.put(X11_NAME_SPACE, layers)
//            println("→ isKeySpace: $layers")
        }
        isKeyStartingWithLat(line) -> {

        }
    }
}
