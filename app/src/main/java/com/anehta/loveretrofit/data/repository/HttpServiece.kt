package com.anehta.loveretrofit.data.repository

import com.anehta.loveretrofit.data.model.RentBikeStatus
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface HttpServiece {
    @GET("/{KEY}/json/bikeList/1/10")
    fun getHttpTitle(
        @Path("KEY") apiKey : String
    ): Call<RentBikeStatus>
}