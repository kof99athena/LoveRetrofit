package com.anehta.loveretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//http://openapi.seoul.go.kr:8088/4b467053477a78703435654b717962/json/bikeList/1/5/

interface HttpServiece {
    @GET("/{KEY}/json/bikeList/1/10")
    suspend fun getHttpTitle(
        @Path("KEY") apiKey : String
    ): BikeStationResponse
}






