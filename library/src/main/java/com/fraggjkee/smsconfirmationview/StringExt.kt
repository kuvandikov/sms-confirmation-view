package com.fraggjkee.smsconfirmationview

internal fun String.alphanumeric(): String = filter { char -> char.isLetterOrDigit() }
