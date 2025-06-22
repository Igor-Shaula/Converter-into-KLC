package org.igor_shaula

fun isEnglishUSNameGroup1(line: String) =
    line.normalize() == NAME_GROUP_1 + EQUALS + DOUBLE_QUOTE + ENGLISH_US + DOUBLE_QUOTE + SEMICOLON

fun isKeyTilda(line: String): Boolean {
    val normalizedLine = line.normalize()
    return normalizedLine.startsWith(KEY_TILDE + OPENING_BRACKETS) && normalizedLine.contains(CLOSING_BRACKETS + SEMICOLON)
}

fun isKeyStartingWithA(line: String): Boolean {
    val normalizedLine = line.normalize()
    return normalizedLine.startsWith(KEY_A_BEGINNING) && normalizedLine.contains(CLOSING_BRACKETS + SEMICOLON)
}

// Remove all whitespace and then compare with the normalized pattern
private fun String.normalize() = replace(REGEX_FOR_REMOVING_BLANKS.toRegex(), EMPTY_STRING)
