package org.igor_shaula.logic

import org.igor_shaula.globals.*

data class ValuesForLayers(
    val layer1: String, // base
    val layer2: String = EMPTY_STRING, // + Shift → optional
    val layer3: String = EMPTY_STRING, // + AltGr → optional
    val layer4: String = EMPTY_STRING // + AltGr & Shift → optional
)

internal fun createValuesForLayers(input: String): ValuesForLayers {
    val content = input.substring(
        startIndex = input.indexOf(X11_OPENING_BRACKETS) + X11_OPENING_BRACKETS.length,
        endIndex = input.indexOf(X11_CLOSING_BRACKETS)
    )
    val values = content.split(COMMA).map { it.trim() }
    return ValuesForLayers(
        layer1 = values[0].mapToKeysym(),
        layer2 = values.getOrElse(1) { EMPTY_STRING }.mapToKeysym(),
        layer3 = values.getOrElse(2) { EMPTY_STRING }.mapToKeysym().filterCommands(),
        layer4 = values.getOrElse(3) { EMPTY_STRING }.mapToKeysym().filterCommands()
    )
}

internal fun ValuesForLayers.adaptForWindows() = ValuesForLayers(
    layer1 = this.layer1,
    layer2 = this.layer2,
    layer3 = this.layer3.ifEmpty { KLC_ABSENT_SYMBOL_VALUE },
    layer4 = this.layer4.ifEmpty { KLC_ABSENT_SYMBOL_VALUE })
