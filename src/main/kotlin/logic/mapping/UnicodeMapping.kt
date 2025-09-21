package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.dictionaries.keysymToUnicodeMap
import org.igor_shaula.logic.Repository
import org.igor_shaula.utils.l

object UnicodeMapping : IMapping {

    override fun prepare(repository: Repository) {
        repository.getX11SymbolsMap().forEach {
            repository.setUnicodeValue(it.key, keysymToUnicodeMap[it.value] ?: it.value)
        }
        l("prepare: ${repository.printUnicodeValuesMap()}")
    }
}