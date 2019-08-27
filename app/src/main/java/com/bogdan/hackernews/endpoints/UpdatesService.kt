package com.bogdan.hackernews.endpoints

import retrofit2.Call
import retrofit2.http.GET

interface UpdatesService {
    @GET("/updates")
    fun getUpdates(): Call<List<UpdatesService>>
}