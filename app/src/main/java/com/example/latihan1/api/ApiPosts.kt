package com.example.latihan1.api

import com.example.latihan1.responses.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiPosts {
    @GET("posts")

    fun getPosts(): Call<ArrayList<PostResponse>>
}