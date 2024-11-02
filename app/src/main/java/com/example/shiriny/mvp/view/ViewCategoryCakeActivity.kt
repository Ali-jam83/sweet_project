package com.example.shiriny.mvp.view

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shiriny.R
import com.example.shiriny.adapter.AdapterCakeCategoryTop
import com.example.shiriny.adapter.data.DataItemTop
import com.example.shiriny.databinding.ActivityCakeCategoryBinding
import com.example.shiriny.databinding.ActivityMainBinding
import com.example.shiriny.databinding.FragmentCakesBinding
import com.example.shiriny.databinding.FragmentHomeBinding

class ViewCategoryCakeActivity(private val context: Context) {

    val binding = ActivityCakeCategoryBinding.inflate(LayoutInflater.from(context))

    fun initRecyclerTop() {
        val adapter =
            AdapterCakeCategoryTop(arrayListOf(
                DataItemTop(R.drawable.img_zaba, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_tavalood, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_sib, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_makhsos, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_khameiii, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_khameiii, "یشیرینی زبان"),
                DataItemTop(R.drawable.img_baghlava, "یشیرینی زبان"),
                DataItemTop(R.drawable.gerdo_img, "یشیرینی زبان"),
                DataItemTop(R.drawable.koodak_img, "یشیرینی زبان")
            )
            )
        binding.recyclerTop.adapter = adapter

        binding.recyclerTop.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

}