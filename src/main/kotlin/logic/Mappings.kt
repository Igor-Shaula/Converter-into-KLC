package org.igor_shaula.logic

import org.igor_shaula.globals.*

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

internal fun parseAliasLine(line: String): Pair<String, String>? {
    val regex = X11_REGEX_FOR_ALIASES_FILE.toRegex()
    val matchResult = regex.find(line)
    return matchResult?.let {
        val (alias, keycode) = it.destructured
        alias to keycode
    }
}

internal fun parseLayoutInclude(includeString: String): Pair<String, String> {
    val regex = """(\w+)\((\w+)\)""".toRegex()
    val matchResult = regex.find(includeString) // for example: include "us(basic)"
    return matchResult?.let {
        Pair(it.groupValues[1], it.groupValues[2]) // filename: "us", layout: "basic"
    } ?: throw Error.WithParsing("Invalid include format. Expected format: 'layout(variant)'")
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
    else -> Data.x11SymbolsDictionary[base]?.uppercase()
}
