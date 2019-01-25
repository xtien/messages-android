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