package org.igor_shaula

fun parseKeySymDefinition(input: String): Pair<String, String>? {

    if (input.isBlank()) return null

    val regex = REGEX_FOR_KEYSYMDEF_FILE.toRegex()

    val matchResult = regex.find(input)
    return matchResult?.let {
        var (name, code) = it.destructured
        if (code.startsWith(X11_PREFIX)) code = code.substring(X11_PREFIX.length)
        name to code
    }
}