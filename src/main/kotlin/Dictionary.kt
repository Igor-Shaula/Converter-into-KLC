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

val xkbToWindowsScancode: Map<String, String> = mapOf(
    "AE01" to "02", // 1
    "AE02" to "03", // 2
    "AE03" to "04", // 3
    "AE04" to "05", // 4
    "AE05" to "06", // 5
    "AE06" to "07", // 6
    "AE07" to "08", // 7
    "AE08" to "09", // 8
    "AE09" to "0A", // 9
    "AE10" to "0B", // 0
    "AE11" to "0C", // -
    "AE12" to "0D", // =

    "AD01" to "10", // Q
    "AD02" to "11", // W
    "AD03" to "12", // E
    "AD04" to "13", // R
    "AD05" to "14", // T
    "AD06" to "15", // Y
    "AD07" to "16", // U
    "AD08" to "17", // I
    "AD09" to "18", // O
    "AD10" to "19", // P
    "AD11" to "1A", // [
    "AD12" to "1B", // ]

    "AC01" to "1E", // A
    "AC02" to "1F", // S
    "AC03" to "20", // D
    "AC04" to "21", // F
    "AC05" to "22", // G
    "AC06" to "23", // H
    "AC07" to "24", // J
    "AC08" to "25", // K
    "AC09" to "26", // L
    "AC10" to "27", // ;
    "AC11" to "28", // '

    "AB01" to "2C", // Z
    "AB02" to "2D", // X
    "AB03" to "2E", // C
    "AB04" to "2F", // V
    "AB05" to "30", // B
    "AB06" to "31", // N
    "AB07" to "32", // M
    "AB08" to "33", // ,
    "AB09" to "34", // .
    "AB10" to "35", // /

    "TLDE" to "29", // ` ~
    "BKSP" to "0E", // Backspace
    "TAB" to "0F", // Tab
    "CAPS" to "3A", // Caps Lock
    "RTRN" to "1C", // Enter
    "LFSH" to "2A", // Left Shift
    "RTSH" to "36", // Right Shift
    "LCTL" to "1D", // Left Ctrl
    "RCTL" to "61", // Right Ctrl (approx.)
    "LALT" to "38", // Left Alt
    "RALT" to "64", // Right Alt / AltGr
    "SPCE" to "39"  // Space
)

fun generateVKValue(base: String) = when (base) {
    "002d" -> "OEM_MINUS"
    "003d" -> "OEM_PLUS"
    "003a" -> "OEM_1"
    "003f" -> "OEM_2"
    "002e" -> "OEM_3" // Tilde
    "007b" -> "OEM_4"
//    "003a" -> "OEM_5"
    "007d" -> "OEM_6"
    "0027" -> "OEM_7"
//    "005d" -> "OEM_8"
    "0020" -> "SPACE"
    // what about "DECIMAL" ???
    else -> base.uppercase()
}

fun getVkValueByScValue(base: String?) = when (base) {
    "0c" -> "OEM_MINUS"
    "0d" -> "OEM_PLUS"
    "12" -> "OEM_1"
    "23" -> "OEM_2"
    "29" -> "OEM_3" // Tilde
    "15" -> "OEM_4"
//    "003a" -> "OEM_5"
    "16" -> "OEM_6"
    "14" -> "OEM_7"
//    "005d" -> "OEM_8"
    "39" -> "SPACE"
    "53" -> "DECIMAL"
    else -> symbolsDictionary[base]?.uppercase()
}

fun getCapitalized(base: String) = if (base.length == 1 && base.first().isLetter()) 1 else 0