package org.igor_shaula

// Remove all whitespace and then compare with the normalized pattern
fun String.normalize() = replace(REGEX_WHITESPACES.toRegex(), EMPTY_STRING)

fun isEnglishUSNameGroup1(normalizedLine: String) =
    normalizedLine == NAME_GROUP_1 + EQUALS + DOUBLE_QUOTE + ENGLISH_US + DOUBLE_QUOTE + SEMICOLON

fun isKeyTilde(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, KEY_TILDE + OPENING_BRACKETS)

fun isKeySpace(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, KEY_SPACE + OPENING_BRACKETS)

fun isKeyStartingWithA(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, KEY_A_BEGINNING)

private fun lineContainsTheKeyAndEndsCorrectly(normalizedLine: String, key: String) =
    normalizedLine.startsWith(key) && normalizedLine.contains(CLOSING_BRACKETS + SEMICOLON)

fun isXkbSymbolsSection(line: String): Boolean {
    // Create a regex pattern that matches "xkb_symbols" followed by any word in quotes
    val pattern = XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(line)
}

// If you also need to extract the section name:
fun getXkbSymbolsSectionName(line: String): String? {
    val pattern = XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.find(line)?.groupValues?.get(1)
}

fun isLayoutEndingBlock(line: String) = line.startsWith(LAYOUT_ENDING_BLOCK)