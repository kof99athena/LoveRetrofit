package com.anehta.loveretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.databinding.ActivityMainBinding
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val httpList = ArrayList<HttpItem>()
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))
        httpList.add(HttpItem("a"))

        binding.recyclerView.adapter = HttpAdapter(this,httpList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
