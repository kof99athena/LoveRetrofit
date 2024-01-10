package com.anehta.loveretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient {

    private const val BASE_URL = "http://openapi.seoul.go.kr:8088"

    val retrofit : Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val httpService : HttpServiece by lazy {
        retrofit.create(HttpServiece::class.java)
    }
}







