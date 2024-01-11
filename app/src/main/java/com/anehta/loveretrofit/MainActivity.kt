package com.anehta.loveretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.databinding.ActivityMainBinding
import com.google.android.material.carousel.CarouselLayoutManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val httpList = ArrayList<HttpItem>()

        loadDate()
        binding.recyclerView.adapter = HttpAdapter(this,httpList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


    }
}

private fun loadDate() {
    val service = HttpClient.instance

    service.getHttpTitle("4b467053477a78703435654b717962")
        .enqueue(object : Callback<HttpItem>{
            override fun onResponse(call: Call<HttpItem>, response: Response<HttpItem>) {
                if(response.isSuccessful){
                    if (response.code() ==200 ){
                        val title = response.body()?.stationName


                    }
                }
            }

            override fun onFailure(call: Call<HttpItem>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }

        })

}
