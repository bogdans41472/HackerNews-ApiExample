package com.bogdan.hackernews.endpoints

import retrofit2.Call
import retrofit2.http.GET

interface MaxItemService {
    @GET("/maxitem")
    fun getMaxItem(): Call<String>
}