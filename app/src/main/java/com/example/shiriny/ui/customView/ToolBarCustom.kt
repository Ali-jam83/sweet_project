package com.example.shiriny.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.shiriny.R
import com.example.shiriny.databinding.ToolBarCustomBinding


class ToolBarCustom(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

     private val binding = ToolBarCustomBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
        initialize(attrs)

    }

    private fun initialize(attr: AttributeSet) {

        val typeArray = context.obtainStyledAttributes(attr, R.styleable.ToolBarCustom)

        val boolean = typeArray.getBoolean(R.styleable.ToolBarCustom_show_back_shop,false)

        if (boolean){

            binding.imageViewNotification.visibility = INVISIBLE

            binding.imageShopping.visibility = VISIBLE

            binding.imageBack.visibility = VISIBLE
        }



        typeArray.recycle()
    }

    fun  imageBack () = binding.imageBack

    fun imageNotification () = binding.imageViewNotification

    fun shopping () = binding.imageShopping





}