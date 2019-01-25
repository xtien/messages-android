/*
 * Copyright (c) 2019, Zaphod Consulting BV, Christine Karman
 * This project is free software: you can redistribute it and/or modify it under the terms of
 * the Apache License, Version 2.0. You can find a copy of the license at
 * http://www. apache.org/licenses/LICENSE-2.0.
 */

package com.loqli.messages.model

import java.time.LocalDate

class Message {

    var id: Int = 0

    var status: Int = 0

    var header: String? = null

    var text: String? = null

    var dateFrom: String? = null

    var dateUntil: String? = null

    private var dateEntered: String? = null

    private val users: Collection<User>? = null

    constructor() {}

}
