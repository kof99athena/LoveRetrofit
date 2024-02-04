package com.anehta.loveretrofit.data.model

import com.google.gson.annotations.SerializedName


data class RentBikeStatus(
    @SerializedName("rentBikeStatus")
    val rentBikeStatus: RentBikeStatusDetail
)
data class RentBikeStatusDetail(
    @SerializedName("list_total_count") val list_total_count : Int,
    @SerializedName("RESULT") val result : Result,
    @SerializedName("row") val row : ArrayList<HttpItem>
)

data class Result(
    @SerializedName("CODE") val CODE : String,
    @SerializedName("MESSAGE") val MESSAGE : String
)

data class HttpItem(
    @SerializedName("rackTotCnt") val rackTotCnt : String,
    @SerializedName("stationName") val stationName : String,
    @SerializedName("parkingBikeTotCnt") val parkingBikeTotCnt : String,
    @SerializedName("shared") val shared : String,
    @SerializedName("stationLatitude") val stationLatitude : String,
    @SerializedName("stationLongitude") val stationLongitude : String,
    @SerializedName("stationId") val stationId : String,
)
