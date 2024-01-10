package com.anehta.loveretrofit

import com.google.gson.annotations.SerializedName

data class HttpItem(
    @SerializedName("rackTotCnt") val rackTotCnt : String,
    @SerializedName("stationName") val stationName : String,
    @SerializedName("parkingBikeTotCnt") val parkingBikeTotCnt : String,
    @SerializedName("shared") val shared : String,
    @SerializedName("stationLatitude") val stationLatitude : String,
    @SerializedName("stationLongitude") val stationLongitude : String,
    @SerializedName("stationId") val stationId : String,
)
