package com.anehta.loveretrofit.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.loveretrofit.main.view.adapter.HttpAdapter
import com.anehta.loveretrofit.api.HttpItem
import com.anehta.loveretrofit.databinding.ActivityMainBinding
import com.anehta.loveretrofit.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainViewModel : MainViewModel by viewModels()

    @Inject
    lateinit var adapter : HttpAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setUpUI()
        setUpObservers()

        val httpList = ArrayList<HttpItem>()
        binding.recyclerView.adapter = HttpAdapter(this,httpList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
