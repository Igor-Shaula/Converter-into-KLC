package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.dictionaries.xkbToWindowsScancodeMap
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.models.ValuesForWindows
import org.igor_shaula.utils.l

object WindowsEssenceMapping : IMapping {

    override fun prepare(repository: Repository) = with(repository) {
        getX11EssenceMap().map { (key, value) ->
            setWindowsEssenceValue(
                xkbToWindowsScancodeMap[key], ValuesForWindows(key, value)
            )
        }
        l("prepared Windows essence map: ${getWindowsEssenceMap()}")
    }
}