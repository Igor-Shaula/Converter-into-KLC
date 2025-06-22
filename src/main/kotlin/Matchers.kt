package org.igor_shaula

fun isEnglishUSNameGroup1(line: String): Boolean {
    // Remove all whitespace and then compare with the normalized pattern
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine == """name[Group1]="English(US)";"""
}

fun isTLDEKeyWithSymbols(line: String): Boolean {
    // Remove all whitespace and then compare with the normalized pattern
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine == """key<TLDE>{["""
}

fun isKeyA(line: String): Boolean {
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine == """key <A"""
}
