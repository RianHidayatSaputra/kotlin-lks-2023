package com.example.latihan1.config

import com.example.latihan1.api.ApiPosts
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val instance: ApiPosts by lazy {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

        retrofit.create(ApiPosts::class.java)
    }
}