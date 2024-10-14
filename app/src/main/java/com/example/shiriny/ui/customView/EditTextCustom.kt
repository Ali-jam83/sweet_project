package com.example.shiriny.ui.customView

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.shiriny.R
import com.example.shiriny.databinding.CustomEditTextBinding

class EditTextCustom(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding = CustomEditTextBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
        initialize(attrs)

    }

    private fun initialize(attrs: AttributeSet) {

        val arrayType = context.obtainStyledAttributes(attrs, R.styleable.EditTextCustom)

        val text = arrayType.getString(R.styleable.EditTextCustom_android_text)
        val hint = arrayType.getString(R.styleable.EditTextCustom_android_hint)

        binding.edtTxt.text = Editable.Factory().newEditable(text)
        binding.edtTxt.hint = Editable.Factory().newEditable(hint)

        arrayType.recycle()

    }
}