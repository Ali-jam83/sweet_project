package com.example.shiriny.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.shiriny.R
import com.example.shiriny.databinding.CustomRecyclerViewBinding

class RecyclerCustom(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {


    private val binding =
        CustomRecyclerViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        addView(binding.root)

        initialize(attrs)
    }

    private fun initialize(attrs: AttributeSet) {

        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RecyclerCustom)

        val title = typedArray.getString(R.styleable.RecyclerCustom_title)
        binding.txtTitle.text = title

        typedArray.recycle()

    }

}