package com.anehta.loveretrofit.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anehta.loveretrofit.data.repository.HttpRepository
import com.anehta.loveretrofit.data.model.RentBikeStatus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HttpViewModel : ViewModel() {

    private val repository = HttpRepository()
    private val _result = MutableLiveData<ArrayList<RentBikeStatus>>()
    val result: LiveData<ArrayList<RentBikeStatus>>
        get() = _result

    fun getData() {
        repository.getData().enqueue(object : Callback<RentBikeStatus> {
            override fun onResponse(
                call: Call<RentBikeStatus>,
                response: Response<RentBikeStatus>
            ) {
                if (response.isSuccessful) {
                    val httpData: RentBikeStatus? = response.body()
                    Log.d("HttpData", "httpData: $httpData")

                    httpData?.let {
                        _result.value = arrayListOf(it)
                    }
                }
            }

            override fun onFailure(call: Call<RentBikeStatus>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }

        })
    }


}
