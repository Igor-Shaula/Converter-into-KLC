package org.igor_shaula.utils

import org.igor_shaula.logic.io.AppConfiguration

// decided to have a simple custom logger for customization in the future
fun l(message: String?) = if (AppConfiguration.isLoggingAllowed) println(message = message) else Unit

// needed to anyway print the arguments - bypassing the effect of "-s" on the main logger
fun lForArgs(message: String?) = println(message = message)
