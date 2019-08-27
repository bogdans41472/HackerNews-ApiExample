package com.bogdan.hackernews.endpoints

import com.bogdan.hackernews.models.Items
import retrofit2.Call
import retrofit2.http.GET

interface ItemsService {

    @GET("/item/")
    fun getItem(itemId: Int): Call<List<Items>>
}