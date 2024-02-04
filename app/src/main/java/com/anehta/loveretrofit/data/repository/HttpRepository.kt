package com.anehta.loveretrofit.data.repository

class HttpRepository {

    private val client = HttpClient.httpService
    fun getData() = client.getHttpTitle("4b467053477a78703435654b717962")
}