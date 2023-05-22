package com.example.chichat.di

import com.example.chichat.model.popVideo
import retrofit2.http.GET
import retrofit2.http.Query

interface ChitChatAPI {

    @GET("/popular")
    suspend fun getPopVideos(@Query("page") page : Int): List<popVideo>

}