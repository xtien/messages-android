/*
 * Copyright (c) 2019, Zaphod Consulting BV, Christine Karman
 * This project is free software: you can redistribute it and/or modify it under the terms of
 * the Apache License, Version 2.0. You can find a copy of the license at
 * http://www. apache.org/licenses/LICENSE-2.0.
 */

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
