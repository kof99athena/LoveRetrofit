package com.anehta.loveretrofit

import com.google.gson.annotations.SerializedName


data class BikeStationResponse(
    val rentBikeStatus: RentBikeStatus
)

data class RentBikeStatus(
    val list_total_count: Int,
    val RESULT: Result,
    val row: List<BikeStation>
)

data class Result(
    val CODE: String,
    val MESSAGE: String
)

data class BikeStation(
    val rackTotCnt: String,
    val stationName: String,
    val parkingBikeTotCnt: String,
    val shared: String,
    val stationLatitude: String,
    val stationLongitude: String,
    val stationId: String
)