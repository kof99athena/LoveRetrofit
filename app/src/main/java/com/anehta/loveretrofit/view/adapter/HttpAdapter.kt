
package com.anehta.loveretrofit.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anehta.loveretrofit.data.model.RentBikeStatus
import com.anehta.loveretrofit.databinding.RecyclerItemBinding

class HttpAdapter(context: Context) : ListAdapter<RentBikeStatus, HttpAdapter.VH>(HttpDiffCallback()) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class VH(binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val title: TextView = binding.tv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = RecyclerItemBinding.inflate(inflater, parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = getItem(position)
        if (item.rentBikeStatus.row.isNotEmpty()) {
            val stationName = item.rentBikeStatus.row[0].stationName // Access the first element or iterate as needed
            holder.title.text = stationName
        } else {
            holder.title.text = "No station available"
        }
    }

    private class HttpDiffCallback : DiffUtil.ItemCallback<RentBikeStatus>() {
        override fun areItemsTheSame(oldItem: RentBikeStatus, newItem: RentBikeStatus): Boolean {
            // 기준이 되는 값이 같으면 true 반환
            return oldItem.rentBikeStatus.row.getOrNull(1)?.stationName == newItem.rentBikeStatus.row.getOrNull(1)?.stationName
        }

        override fun areContentsTheSame(oldItem: RentBikeStatus, newItem: RentBikeStatus): Boolean {
            // 내용이 같으면 true 반환 (여기서는 모든 내용을 비교하도록 구현했지만, 실제로 필요한 내용만 비교하도록 수정할 수 있습니다)
            return oldItem.rentBikeStatus.row.getOrNull(1)?.stationName == newItem.rentBikeStatus.row.getOrNull(1)?.stationName
        }
    }
}
