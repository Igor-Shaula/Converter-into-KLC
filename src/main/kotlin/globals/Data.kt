package org.igor_shaula.globals

import org.igor_shaula.logic.ValuesForLayers

object Data {
    internal var languageBlockCounter = 0
    internal var isInsideKeycodesBlock = false

    internal val x11SymbolsDictionary = mutableMapOf<String, String>()
    internal val x11LatAliasesDictionary = mutableMapOf<String, String>()

    internal val x11Essence = mutableMapOf<String, ValuesForLayers>()

    internal val windowsEssence = mutableMapOf<String?, ValuesForLayers>()
}