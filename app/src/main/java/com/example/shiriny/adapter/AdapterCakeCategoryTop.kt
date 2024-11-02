package com.example.shiriny.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shiriny.adapter.data.DataItemTop
import com.example.shiriny.databinding.ItemRecyclerTopCategoryBinding

class AdapterCakeCategoryTop(
    private val listItem: ArrayList<DataItemTop>
) : RecyclerView.Adapter<AdapterCakeCategoryTop.ViewHolderTop>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTop =
        ViewHolderTop(ItemRecyclerTopCategoryBinding.inflate(LayoutInflater.from(parent.context)))

    override fun getItemCount() = listItem.size

    override fun onBindViewHolder(holder: ViewHolderTop, position: Int) {
        holder.setData(listItem[position])
    }


    inner class ViewHolderTop(
        private val binding: ItemRecyclerTopCategoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setData(item: DataItemTop) {

            binding.nameCake.text = item.name
            binding.imgCake.setImageResource(item.id)
        }
    }
}