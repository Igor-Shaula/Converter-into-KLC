package org.igor_shaula.logic

import org.igor_shaula.globals.Str
import org.igor_shaula.logic.models.ValuesForLayers
import org.igor_shaula.logic.models.ValuesForWindows

// I decided to avoid global state management by explicitly passing the data container where needed
class Repository {

    /**
     * mapping of predefined (in keysymdef.h) X11 keysym names to keysym codes like A=0041 or BackSpace=ff08
     */
    private val x11SymbolsMap = mutableMapOf<String, String>()

    fun getX11SymbolsMap() = x11SymbolsMap as Map<String, String>

    fun setX11Symbol(keyName: String, value: String) {
        x11SymbolsMap[keyName] = value
    }

    /**
     * mapping of predefined (in keysymdef.h) X11 keysym names to Unicode symbols' values - based on x11SymbolsMap values.
     * like "01a1" to "0104". string format of Unicode symbols is used here for simplicity and performance reasons.
     */
    private val unicodeValuesMap = mutableMapOf<String, String?>()

    fun getUnicodeValuesMap() = unicodeValuesMap as Map<String, String?>

    fun getUnicodeValue(keyName: String?) = unicodeValuesMap[keyName]

    fun setUnicodeValue(keyName: String, value: String) { // value is not null as it's mapped from the x11SymbolsMap
        unicodeValuesMap[keyName] = value
    }

    /**
     * mapping of predefined (in keycodes/aliases) X11 aliases to keycodes from the keyboard.
     * needed to map the X11 key aliases to the actual keysym codes, like LatQ=AD01
     */
    private val x11LatAliasesMap = mutableMapOf<String, String>()

    fun getX11LatAliasesMap() = x11LatAliasesMap as Map<String, String>

    fun getX11LatAlias(keyName: String?) = x11LatAliasesMap[keyName]

    fun setX11LatAlias(keyName: String, value: String) {
        x11LatAliasesMap[keyName] = value
    }

    fun isX11LatAliasMapEmpty() = x11LatAliasesMap.isEmpty()

    /**
     * mapping of X11 keysym names to 4 layers of values for each key:
     * the first layer is for the key itself,
     * the second for the Shifted key,
     * the third for the Alt-gr key,
     * and the fourth for the Alt-gr-Shifted key.
     */
    private val x11EssenceMap = mutableMapOf<String, ValuesForLayers>()

    fun getX11EssenceMap() = x11EssenceMap as Map<String, ValuesForLayers>

    fun setX11EssenceValue(keyName: String, value: ValuesForLayers) {
        x11EssenceMap[keyName] = value
    }

    fun updateX11EssenceValue(keyName: String, newValue: ValuesForLayers) {
        if (x11EssenceMap.containsKey(keyName)) {
//            l("existing values for key:  $keyName: ${x11EssenceMap[keyName]}")
//            l("overridden value for key: $keyName, $newValue")
            val layer1 = newValue.layer1.ifEmpty { x11EssenceMap[keyName]?.layer1 ?: Str.EMPTY }
            val layer2 = newValue.layer2.ifEmpty { x11EssenceMap[keyName]?.layer2 ?: Str.EMPTY }
            val layer3 = newValue.layer3.ifEmpty { x11EssenceMap[keyName]?.layer3 ?: Str.EMPTY }
            val layer4 = newValue.layer4.ifEmpty { x11EssenceMap[keyName]?.layer4 ?: Str.EMPTY }
            x11EssenceMap[keyName] = ValuesForLayers(layer1, layer2, layer3, layer4)
        }
    }

    /**
     * mapping of SC number to 4 layers of values for each key:
     * the first layer is for the key itself,
     * the second for the Shifted key,
     * the third for the Alt-gr key,
     * and the fourth for the Alt-gr-Shifted key.
     */
    private val windowsEssenceMap = mutableMapOf<String?, ValuesForWindows>()

    fun getWindowsEssenceMap() = windowsEssenceMap as Map<String?, ValuesForWindows>

    fun setWindowsEssenceValue(keyName: String?, value: ValuesForWindows) {
        windowsEssenceMap[keyName] = value
    }
}