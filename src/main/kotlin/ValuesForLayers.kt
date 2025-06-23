package org.igor_shaula

data class ValuesForLayers(
    val layer1: String, // base
    val layer2: String, // + Shift
    val layer3: String, // + AltGr
    val layer4: String // + AltGr & Shift
)

fun createValuesForLayers(input: String): ValuesForLayers {
    val content = input.substring(
        startIndex = input.indexOf(OPENING_BRACKETS) + OPENING_BRACKETS.length,
        endIndex = input.indexOf(CLOSING_BRACKETS)
    )
    val values = content.split(LAYER_SEPARATOR).map { it.trim() }
    return ValuesForLayers(
        layer1 = values[0], layer2 = values[1], layer3 = values[2], layer4 = values[3]
    )
}