package org.igor_shaula.logic

import org.igor_shaula.TAB
import org.igor_shaula.X11_EXTENDED_CODE_PREFIX
import org.igor_shaula.X11_REGEX_FOR_KEYSYMDEF_FILE
import org.igor_shaula.x11SymbolsDictionary

internal fun parseKeySymDefinition(input: String): Pair<String, String>? {

    if (input.isBlank()) return null

    val regex = X11_REGEX_FOR_KEYSYMDEF_FILE.toRegex()

    val matchResult = regex.find(input)
    return matchResult?.let {
        var (name, code) = it.destructured
        if (code.startsWith(X11_EXTENDED_CODE_PREFIX)) code = code.substring(X11_EXTENDED_CODE_PREFIX.length)
        name to code
    }
}

internal fun getVkValueByScValue(base: String?) = when (base) {
    "0c" -> "OEM_MINUS"
    "0d" -> "OEM_PLUS"
    "30" -> "OEM_COMMA"
    "31" -> "OEM_PERIOD"
    "12" -> "OEM_1$TAB" // colon
    "23" -> "OEM_2$TAB" // solidus / slash
    "29" -> "OEM_3$TAB" // tilde
    "15" -> "OEM_4$TAB" // left square bracket
//    "??" -> "OEM_5$TAB"
    "16" -> "OEM_6$TAB" // right square bracket
    "14" -> "OEM_7$TAB" // apostrophe
    "39" -> "SPACE$TAB"
    "53" -> "DECIMAL"
    else -> x11SymbolsDictionary[base]?.uppercase()
}
