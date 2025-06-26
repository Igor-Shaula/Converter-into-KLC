package org.igor_shaula

data class ValuesForLayers(
    val layer1: String, // base
    val layer2: String = EMPTY_STRING, // + Shift → optional
    val layer3: String = EMPTY_STRING, // + AltGr → optional
    val layer4: String = EMPTY_STRING // + AltGr & Shift → optional
)

fun createValuesForLayers(input: String): ValuesForLayers {
    val content = input.substring(
        startIndex = input.indexOf(OPENING_BRACKETS) + OPENING_BRACKETS.length,
        endIndex = input.indexOf(CLOSING_BRACKETS)
    )
    val values = content.split(LAYER_SEPARATOR).map { it.trim() }
    return ValuesForLayers(
        layer1 = values[0].mapToKeysym(),
        layer2 = values.getOrElse(1) { EMPTY_STRING }.mapToKeysym(),
        layer3 = values.getOrElse(2) { EMPTY_STRING }.mapToKeysym().filterCommands(),
        layer4 = values.getOrElse(3) { EMPTY_STRING }.mapToKeysym().filterCommands()
    )
}

fun String.mapToKeysym(): String = when {
    this.isBlank() -> EMPTY_STRING // should not ever happen
    this.length == 1 -> this // must be located before the next case with starting-with-U
    this.startsWith(BEGINNING_OF_UNICODE_NUMBER) && this.length == X11_UNICODE_NUMBER_LENGTH
        -> this.substring(1).lowercase() // because the length of the char U is 1
//    this.startsWith('f') && this.length == 4 -> EMPTY_STRING // special case of using commands in KB layouts only in Linux
    else -> symbolsDictionary[this]?.lowercase() ?: this.lowercase().filterMissingKeysyms()
}

fun String.filterCommands() = if (this.lowercase().startsWith(BEGINNING_OF_COMMAND_SYMBOL)) EMPTY_STRING else this

fun String.filterMissingKeysyms() =
    if (this == NOSYMBOL || this.startsWith(X11_PREFIX_HEX) && this.length > UNICODE_NUMBER_LENGTH) EMPTY_STRING else this

fun String.getKeyNameStartingWithA() = substring(KEY_A_BEGINNING.length - 1, KEY_A_BEGINNING.length + 3) // 4 in total