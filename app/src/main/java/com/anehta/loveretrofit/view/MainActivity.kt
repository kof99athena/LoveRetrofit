package com.anehta.loveretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.view.adapter.HttpAdapter
import com.anehta.loveretrofit.viewmodel.HttpViewModel
import com.anehta.loveretrofit.data.model.HttpItem
import com.anehta.loveretrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val httpList = ArrayList<HttpItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = HttpAdapter(this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this)[HttpViewModel::class.java]
        viewModel.getData()

        viewModel.result.observe(this, Observer {
            adapter.submitList(it)
        })
    }


}
