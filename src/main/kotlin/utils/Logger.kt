package org.igor_shaula.utils

import org.igor_shaula.logic.io.ArgumentsProcessor

// decided to have a simple custom logger for customization in the future
fun l(message: String?) = if (ArgumentsProcessor.isLoggingAllowed) println(message = message) else Unit
