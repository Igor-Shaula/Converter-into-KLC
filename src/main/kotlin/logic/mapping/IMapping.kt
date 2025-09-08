package org.igor_shaula.logic.mapping

import org.igor_shaula.logic.Repository

interface IMapping {
    fun prepare(repository: Repository)
}