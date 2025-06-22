package org.igor_shaula

// Remove all whitespace and then compare with the normalized pattern
fun String.normalize() = replace(REGEX_FOR_REMOVING_BLANKS.toRegex(), EMPTY_STRING)

fun isEnglishUSNameGroup1(normalizedLine: String) =
    normalizedLine == NAME_GROUP_1 + EQUALS + DOUBLE_QUOTE + ENGLISH_US + DOUBLE_QUOTE + SEMICOLON

fun isKeyTilda(normalizedLine: String) =
    normalizedLine.startsWith(KEY_TILDE + OPENING_BRACKETS) && normalizedLine.contains(CLOSING_BRACKETS + SEMICOLON)

fun isKeyStartingWithA(normalizedLine: String) =
    normalizedLine.startsWith(KEY_A_BEGINNING) && normalizedLine.contains(CLOSING_BRACKETS + SEMICOLON)
