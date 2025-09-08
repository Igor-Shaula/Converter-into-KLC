package org.igor_shaula.logic

import org.igor_shaula.globals.xkbToWindowsScancode
import org.igor_shaula.utils.l

// I decided to avoid global state management by explicitly passing the data container where needed
class Repository {

    internal val x11SymbolsDictionary = mutableMapOf<String, String>()
    internal val x11LatAliasesDictionary = mutableMapOf<String, String>()
    internal val x11Essence = mutableMapOf<String, ValuesForLayers>()

    internal val windowsEssence = mutableMapOf<String?, ValuesForLayers>()

    private val symbolsDictionary = mutableMapOf<String, Char?>()

    internal fun prepareSymbolsDictionary() {
        x11SymbolsDictionary.forEach {
            symbolsDictionary[it.key] = getUnicodeSymbolFromKeysym(it.value)
        }
        l("standard symbols dictionary: $symbolsDictionary")
    }

    internal fun prepareWindowsEssence() {
        x11Essence.map { (key, value) ->
            windowsEssence.put(xkbToWindowsScancode[key], value)
        }
        l("assembled windowsEssence: $windowsEssence")
    }
}