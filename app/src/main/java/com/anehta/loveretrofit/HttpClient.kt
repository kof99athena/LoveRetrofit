package com.anehta.loveretrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient {

    private const val BASE_URL = "http://openapi.seoul.go.kr:8088"

    val instance : HttpServiece by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(HttpServiece::class.java)
    }


}








