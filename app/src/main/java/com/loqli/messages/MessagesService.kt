/*
 * Copyright (c) 2019, Zaphod Consulting BV, Christine Karman
 * This project is free software: you can redistribute it and/or modify it under the terms of
 * the Apache License, Version 2.0. You can find a copy of the license at
 * http://www. apache.org/licenses/LICENSE-2.0.
 */

package com.loqli.messages

import com.loqli.messages.model.MessagesResult
import retrofit2.http.GET
import io.reactivex.Observable

/**
 * User: christine
 * Date: 1/25/19 3:00 PM
 */
interface MessagesService {

    @GET("getMessages/")
    fun getMessages(): Observable<MessagesResult>
}