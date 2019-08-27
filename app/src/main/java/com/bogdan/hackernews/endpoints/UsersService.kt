package com.bogdan.hackernews.endpoints

import com.bogdan.hackernews.models.Users
import retrofit2.Call
import retrofit2.http.GET

interface UsersService {

    @GET("/user")
    fun getUser(): Call<List<Users>>
}

