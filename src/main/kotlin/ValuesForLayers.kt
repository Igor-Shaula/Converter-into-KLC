package org.igor_shaula

data class ValuesForLayers(
    val layer1: String, // base
    val layer2: String = "", // + Shift → optional
    val layer3: String = "", // + AltGr → optional
    val layer4: String = "" // + AltGr & Shift → optional
)

fun createValuesForLayers(input: String): ValuesForLayers {
    val content = input.substring(
        startIndex = input.indexOf(OPENING_BRACKETS) + OPENING_BRACKETS.length,
        endIndex = input.indexOf(CLOSING_BRACKETS)
    )
    val values = content.split(LAYER_SEPARATOR).map { it.trim() }
    return ValuesForLayers(
        layer1 = values[0].mapToKeysym(),
        layer2 = values.getOrElse(1) { "" }.mapToKeysym(),
        layer3 = values.getOrElse(2) { "" }.mapToKeysym().filterCommands(),
        layer4 = values.getOrElse(3) { "" }.mapToKeysym().filterCommands()
    )
}

internal val symbolsDictionary = mutableMapOf<String, String>()

fun String.mapToKeysym(): String = when {
    this.isBlank() -> EMPTY_STRING // should not ever happen
    this.length == 1 -> this // must be located before the next case with starting-with-U
//    this.startsWith('f') && this.length == 4 -> EMPTY_STRING // special case of using commands in KB layouts only in Linux
    else -> symbolsDictionary[this] ?: this.filterMissingKeysyms()
}

fun String.filterCommands() = if (this.startsWith('f')) EMPTY_STRING else this

fun String.filterMissingKeysyms() =
    if (this == "nosymbol" || this.startsWith("0x100") && this.length > 4) EMPTY_STRING else this