package org.igor_shaula.logic

import org.igor_shaula.globals.HEX_RADIX
import org.igor_shaula.globals.keysymToUnicodeMapping
import org.igor_shaula.globals.xkbToWindowsScancode
import org.igor_shaula.logic.models.ValuesForLayers
import org.igor_shaula.utils.l

// I decided to avoid global state management by explicitly passing the data container where needed
class Repository {

    /**
     * mapping of predefined (in keysymdef.h) X11 keysym names to keysym codes like A=0041 or BackSpace=ff08
     */
    private val x11SymbolsDictionary = mutableMapOf<String, String>()

    fun getX11Symbol(keyName: String?) = x11SymbolsDictionary[keyName]

    fun setX11Symbol(keyName: String, value: String) {
        x11SymbolsDictionary[keyName] = value
    }

    fun printX11SymbolsDictionary() = x11SymbolsDictionary.toString()

    /**
     *
     */
    private val symbolsDictionary = mutableMapOf<String, Char?>()

    fun prepareSymbolsDictionary() {
        x11SymbolsDictionary.forEach {
            symbolsDictionary[it.key] = getUnicodeSymbolFromKeysym(it.value)
        }
        l("standard symbols dictionary: $symbolsDictionary")
    }

    private fun getUnicodeSymbolFromKeysym(keysym: String): Char? {
        try {
            val keySymValue = keysym.toInt(HEX_RADIX)
            // X11 Keysym to Unicode mapping for Cyrillic
            val unicodeValue = keysymToUnicodeMapping[keySymValue] ?: keySymValue
            // fallback for non-Cyrillic or direct Unicode values
            return unicodeValue.toChar()
        } catch (e: NumberFormatException) {
            l("Invalid input: '$keysym'. NumberFormatException: ${e.message}")
            return null
        }
    }

    /**
     * mapping of predefined (in keycodes/aliases) X11 aliases to keycodes from the keyboard.
     * needed to map the X11 key aliases to the actual keysym codes, like LatQ=AD01
     */
    private val x11LatAliasesDictionary = mutableMapOf<String, String>()

    fun getX11LatAlias(keyName: String?) = x11LatAliasesDictionary[keyName]

    fun setX11LatAlias(keyName: String, value: String) {
        x11LatAliasesDictionary[keyName] = value
    }

    fun isX11LatAliasDictionaryEmpty() = x11LatAliasesDictionary.isEmpty()

    fun printX11LatAliasesDictionary() = x11LatAliasesDictionary.toString()

    /**
     *
     */
    private val x11Essence = mutableMapOf<String, ValuesForLayers>()

    fun setX11EssenceValue(keyName: String, value: ValuesForLayers) {
        x11Essence[keyName] = value
    }

    fun printX11Essence() = x11Essence.toString()

    /**
     *
     */
    private val windowsEssence = mutableMapOf<String?, ValuesForLayers>()

    fun performWithWindowsEssence(action: (String?, ValuesForLayers) -> Unit) {
        windowsEssence.forEach { (key, value) ->
            action(key, value)
        }
    }

    fun prepareWindowsEssence() {
        x11Essence.map { (key, value) ->
            windowsEssence.put(xkbToWindowsScancode[key], value)
        }
        l("assembled windowsEssence: $windowsEssence")
    }
}