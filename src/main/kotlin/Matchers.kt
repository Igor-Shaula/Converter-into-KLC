package org.igor_shaula

fun isEnglishUSNameGroup1(line: String): Boolean {
    // Remove all whitespace and then compare with the normalized pattern
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine == """name[Group1]="English(US)";"""
}

fun isKeyTilda(line: String): Boolean {
    // Remove all whitespace and then compare with the normalized pattern
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine.startsWith("""key<TLDE>{[""") && normalizedLine.contains("]};")
}

fun isKeyStartingWithA(line: String): Boolean {
    val normalizedLine = line.replace("\\s+".toRegex(), "")
    return normalizedLine.startsWith("""key <A""") && normalizedLine.contains("]};")
}
