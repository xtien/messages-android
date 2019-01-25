package com.loqli.messages.model

/**
 * User: christine
 * Date: 1/25/19 3:07 PM
 */
class MessagesResult {

    private val resultCode: Int = 0

    private var messages: List<Message>? = null

    fun setMessages(messages: List<Message>) {
        this.messages = messages
    }

    fun getMessages(): List<Message>? {
        return messages
    }
}
