package com.anehta.loveretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.databinding.ActivityMainBinding
import com.google.android.material.carousel.CarouselLayoutManager
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val httpList = ArrayList<HttpItem>()
//        httpList.add(HttpItem("a"))
//        httpList.add(HttpItem("b"))
//        httpList.add(HttpItem("c"))
//        httpList.add(HttpItem("d"))
//        httpList.add(HttpItem("e"))
//        httpList.add(HttpItem("f"))
//        httpList.add(HttpItem("g"))
//        httpList.add(HttpItem("h"))

        binding.recyclerView.adapter = HttpAdapter(this,httpList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
