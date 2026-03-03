package com.fraggjkee.smsconfirmationview.smsretriever

internal object SmsParser {

    // TODO this might require improvement/refactoring
    fun parseOneTimeCode(message: String, codeLength: Int): String? {
        val regex = "(?<=:\\s)[A-Za-z0-9]{$codeLength}\\b".toRegex()
        return regex.find(message)?.value
    }
}