package org.igor_shaula

fun isEnglishUSNameGroup1(line: String) = line.normalize() == """name[Group1]="English(US)";"""

fun isKeyTilda(line: String): Boolean {
    val normalizedLine = line.normalize()
    return normalizedLine.startsWith("""key<TLDE>{[""") && normalizedLine.contains("]};")
}

fun isKeyStartingWithA(line: String): Boolean {
    val normalizedLine = line.normalize()
    return normalizedLine.startsWith("""key<A""") && normalizedLine.contains("]};")
}

// Remove all whitespace and then compare with the normalized pattern
private fun String.normalize() = replace("\\s+".toRegex(), "")
