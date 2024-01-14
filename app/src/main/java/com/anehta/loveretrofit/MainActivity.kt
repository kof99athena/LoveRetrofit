package com.anehta.loveretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.databinding.ActivityMainBinding
import com.google.android.material.carousel.CarouselLayoutManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val httpList = ArrayList<BikeStation>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.adapter = HttpAdapter(this, httpList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.btn.setOnClickListener{
            Toast.makeText(this, "토스트", Toast.LENGTH_SHORT).show()
        }

        loadData()


    }



    private fun loadData() {
        // CoroutineScope를 사용하여 코루틴 빌더를 시작
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val service = HttpClient.instance

                // withContext를 사용하여 IO 쓰레드에서 Retrofit 호출
                val response = withContext(Dispatchers.IO) {
                    service.getHttpTitle("4b467053477a78703435654b717962")

    service.getHttpTitle("4b467053477a78703435654b717962")
        .enqueue(object : Callback<HttpItem>{
            override fun onResponse(call: Call<HttpItem>, response: Response<HttpItem>) {
                if(response.isSuccessful){
                    //test branch

                }

                // onResponse를 비구조화하여 사용
                if (response.rentBikeStatus.row != null && response.rentBikeStatus.row.isNotEmpty()) {
                    httpList.addAll(response.rentBikeStatus.row)
                    binding.recyclerView.adapter?.notifyDataSetChanged()
                    Log.e("success",response.rentBikeStatus.RESULT.CODE)
                }
            } catch (e: Exception) {
                Log.e("TAG", e.message.toString())
            }
        }
    }

}

