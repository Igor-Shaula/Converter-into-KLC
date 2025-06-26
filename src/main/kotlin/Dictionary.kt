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

val xkbToWindowsScancode: Map<String, Int> = mapOf(
    "AE01" to 0x02, // 1
    "AE02" to 0x03, // 2
    "AE03" to 0x04, // 3
    "AE04" to 0x05, // 4
    "AE05" to 0x06, // 5
    "AE06" to 0x07, // 6
    "AE07" to 0x08, // 7
    "AE08" to 0x09, // 8
    "AE09" to 0x0A, // 9
    "AE10" to 0x0B, // 0
    "AE11" to 0x0C, // -
    "AE12" to 0x0D, // =

    "AD01" to 0x10, // Q
    "AD02" to 0x11, // W
    "AD03" to 0x12, // E
    "AD04" to 0x13, // R
    "AD05" to 0x14, // T
    "AD06" to 0x15, // Y
    "AD07" to 0x16, // U
    "AD08" to 0x17, // I
    "AD09" to 0x18, // O
    "AD10" to 0x19, // P
    "AD11" to 0x1A, // [
    "AD12" to 0x1B, // ]

    "AC01" to 0x1E, // A
    "AC02" to 0x1F, // S
    "AC03" to 0x20, // D
    "AC04" to 0x21, // F
    "AC05" to 0x22, // G
    "AC06" to 0x23, // H
    "AC07" to 0x24, // J
    "AC08" to 0x25, // K
    "AC09" to 0x26, // L
    "AC10" to 0x27, // ;
    "AC11" to 0x28, // '

    "AB01" to 0x2C, // Z
    "AB02" to 0x2D, // X
    "AB03" to 0x2E, // C
    "AB04" to 0x2F, // V
    "AB05" to 0x30, // B
    "AB06" to 0x31, // N
    "AB07" to 0x32, // M
    "AB08" to 0x33, // ,
    "AB09" to 0x34, // .
    "AB10" to 0x35, // /

    "TLDE" to 0x29, // ` ~
    "BKSP" to 0x0E, // Backspace
    "TAB"  to 0x0F, // Tab
    "CAPS" to 0x3A, // Caps Lock
    "RTRN" to 0x1C, // Enter
    "LFSH" to 0x2A, // Left Shift
    "RTSH" to 0x36, // Right Shift
    "LCTL" to 0x1D, // Left Ctrl
    "RCTL" to 0x61, // Right Ctrl (approx.)
    "LALT" to 0x38, // Left Alt
    "RALT" to 0x64, // Right Alt / AltGr
    "SPCE" to 0x39  // Space
)