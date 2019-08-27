package com.bogdan.hackernews.endpoints

import retrofit2.Call
import retrofit2.http.GET

interface Stories {
    @GET("/beststories")
    fun getBestStories(): Call<List<String>>

    @GET("/topstories")
    fun getTopStories(): Call<List<String>>

    @GET("/newstories")
    fun getNewsStories(): Call<List<String>>

    @GET("/askstories")
    fun getAskStories(): Call<List<String>>

    @GET("/showstories")
    fun getShowStories(): Call<List<String>>

    @GET("/jobstories")
    fun getJobStories(): Call<List<String>>
}