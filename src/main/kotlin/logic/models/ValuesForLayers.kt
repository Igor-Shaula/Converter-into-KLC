package org.igor_shaula.logic.models

import org.igor_shaula.globals.*
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.string_processing.filterCommands
import org.igor_shaula.logic.string_processing.mapToKeysym

data class ValuesForLayers(
    val layer1: String, // base
    val layer2: String = Str.EMPTY, // + Shift → optional
    val layer3: String = Str.EMPTY, // + AltGr → optional
    val layer4: String = Str.EMPTY // + AltGr & Shift → optional
)

internal fun createValuesForLayers(repository: Repository, input: String): ValuesForLayers {
    val content = input.substring(
        startIndex = input.indexOf(X11.OPENING_BRACKETS) + X11.OPENING_BRACKETS.length,
        endIndex = input.indexOf(X11.CLOSING_BRACKETS)
    )
    val values = content.split(Sym.COMMA).map { it.trim() }
    return ValuesForLayers(
        layer1 = values[0].mapToKeysym(repository),
        layer2 = values.getOrElse(1) { Str.EMPTY }.mapToKeysym(repository),
        layer3 = values.getOrElse(2) { Str.EMPTY }.mapToKeysym(repository).filterCommands(),
        layer4 = values.getOrElse(3) { Str.EMPTY }.mapToKeysym(repository).filterCommands()
    )
}

internal fun ValuesForLayers.adaptForWindows() = ValuesForLayers(
    layer1 = this.layer1,
    layer2 = this.layer2,
    layer3 = this.layer3.ifEmpty { Klc.ABSENT_SYMBOL_VALUE },
    layer4 = this.layer4.ifEmpty { Klc.ABSENT_SYMBOL_VALUE })
