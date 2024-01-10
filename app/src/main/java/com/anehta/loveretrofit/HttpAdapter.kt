package com.anehta.loveretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.anehta.loveretrofit.databinding.RecyclerItemBinding

class HttpAdapter constructor(val context : Context, val dataSet : ArrayList<HttpItem>) : Adapter<HttpAdapter.VH>() {
//상속 받을때 반드시 생성자가 필요하다
   inner class VH(binding: RecyclerItemBinding) : ViewHolder(binding.root){
       //inner class는 리사이클러아이템을 말한다.
       //binding으로 파라미터를 받고, 뷰홀더를 상속받는다.
       val title : TextView by lazy { binding.tv }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        //레이아웃매니저를 호출한다. 신규 뷰를 만든다.
        //item 1개를 정의한다.
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return VH(binding) //무엇을 리던하냐? 바인딩을 갖고있는 뷰홀더를 리턴한다.
    }

    override fun getItemCount(): Int {
        //dataSet만큼 리턴한다.
        return dataSet.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        //dataSet의 position에 맞게 요소들을 가져온다.
        //요소들을 재배치한다.
        holder.title.text = dataSet[position].stationName
    }








}
