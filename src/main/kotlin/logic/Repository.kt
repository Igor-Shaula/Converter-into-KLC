package org.igor_shaula.logic

import org.igor_shaula.globals.HEX_RADIX
import org.igor_shaula.globals.dictionaries.keysymToUnicodeMap
import org.igor_shaula.globals.dictionaries.xkbToWindowsScancodeMap
import org.igor_shaula.logic.models.ValuesForLayers
import org.igor_shaula.utils.l

// I decided to avoid global state management by explicitly passing the data container where needed
class Repository {

    /**
     * mapping of predefined (in keysymdef.h) X11 keysym names to keysym codes like A=0041 or BackSpace=ff08
     */
    private val x11SymbolsMap = mutableMapOf<String, String>()

    fun getX11Symbol(keyName: String?) = x11SymbolsMap[keyName]

    fun setX11Symbol(keyName: String, value: String) {
        x11SymbolsMap[keyName] = value
    }

    fun printX11SymbolsMap() = "x11SymbolsMap = $x11SymbolsMap\n"

    /**
     *
     */
    private val unicodeSymbolsMap = mutableMapOf<String, Char?>()

    fun prepareSymbolsMap() {
        x11SymbolsMap.forEach {
            unicodeSymbolsMap[it.key] = getUnicodeSymbolFromKeysym(it.value)
        }
        l("prepareSymbolsMap: ${printSymbolsMap()}")
    }

    private fun getUnicodeSymbolFromKeysym(keysym: String): Char? {
        try {
            val keySymValue = keysym.toInt(HEX_RADIX)
            // X11 Keysym to Unicode mapping for Cyrillic
            val unicodeValue = keysymToUnicodeMap[keySymValue] ?: keySymValue
            // fallback for non-Cyrillic or direct Unicode values
            return unicodeValue.toChar()
        } catch (e: NumberFormatException) {
            l("Invalid input: '$keysym'. NumberFormatException: ${e.message}")
            return null
        }
    }

    fun printSymbolsMap() = "unicodeSymbolsMap = $unicodeSymbolsMap\n"

    /**
     * mapping of predefined (in keycodes/aliases) X11 aliases to keycodes from the keyboard.
     * needed to map the X11 key aliases to the actual keysym codes, like LatQ=AD01
     */
    private val x11LatAliasesMap = mutableMapOf<String, String>()

    fun getX11LatAlias(keyName: String?) = x11LatAliasesMap[keyName]

    fun setX11LatAlias(keyName: String, value: String) {
        x11LatAliasesMap[keyName] = value
    }

    fun isX11LatAliasMapEmpty() = x11LatAliasesMap.isEmpty()

    fun printX11LatAliasesMap() = "x11LatAliasesMap = $x11LatAliasesMap\n"

    /**
     *
     */
    private val x11EssenceMap = mutableMapOf<String, ValuesForLayers>()

    fun setX11EssenceValue(keyName: String, value: ValuesForLayers) {
        x11EssenceMap[keyName] = value
    }

    fun printX11EssenceMap() = "x11EssenceMap = $x11EssenceMap\n"

    /**
     *
     */
    private val windowsEssenceMap = mutableMapOf<String?, ValuesForLayers>()

    fun performWithWindowsEssence(action: (String?, ValuesForLayers) -> Unit) {
        windowsEssenceMap.forEach { (key, value) ->
            action(key, value)
        }
    }

    fun prepareWindowsEssence() {
        x11EssenceMap.map { (key, value) ->
            windowsEssenceMap.put(xkbToWindowsScancodeMap[key], value)
        }
        l("prepareWindowsEssence: ${printWindowsEssenceMap()}")
    }

    fun printWindowsEssenceMap() = "windowsEssenceMap = $windowsEssenceMap\n"
}