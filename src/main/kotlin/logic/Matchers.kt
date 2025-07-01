package org.igor_shaula.logic

import org.igor_shaula.globals.*

fun isEnglishUSNameGroup1(normalizedLine: String) =
    normalizedLine == X11_NAME_GROUP_1 + EQUALS + DOUBLE_QUOTE + X11_ENGLISH_US + DOUBLE_QUOTE + SEMICOLON

fun isKeyTilde(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11_KEY_TILDE + X11_OPENING_BRACKETS)

fun isKeySpace(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11_KEY_SPACE + X11_OPENING_BRACKETS)

fun isKeyStartingWithA(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11_KEY_A_BEGINNING)

fun isKeyStartingWithLat(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11_KEY_LAT_BEGINNING)

private fun lineContainsTheKeyAndEndsCorrectly(normalizedLine: String, key: String) =
    normalizedLine.startsWith(key) && normalizedLine.contains(X11_CLOSING_BRACKETS + SEMICOLON)

fun isXkbSymbolsSection(line: String): Boolean {
    val pattern = X11_REGEX_XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(line)
}

fun isLayoutEndingBlock(line: String) = line.startsWith(X11_LAYOUT_ENDING_BLOCK)

fun isBeginningInclude(line: String): Boolean = line.clearAllBlanks().startsWith(X11_INCLUDE)
