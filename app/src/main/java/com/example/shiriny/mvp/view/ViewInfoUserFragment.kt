package com.example.shiriny.mvp.view

import android.content.Context
import android.view.LayoutInflater
import androidx.core.app.Person
import com.example.shiriny.databinding.FragmentInfoUserBinding


class ViewInfoUserFragment(context: Context) {

    val binding = FragmentInfoUserBinding.inflate(LayoutInflater.from(context))

  fun initView(){

      binding.emailEditable.setOnClickListener {
          binding.textInputEditTextEmail.isEnabled = true
      }
      binding.nameEditable.setOnClickListener {
          binding.textInputEditTextName.isEnabled = true
      }
      binding.numberEditable.setOnClickListener {
          binding.textInputEditTextNumber.isEnabled = true
      }
      binding.codeEditable.setOnClickListener {
          binding.textInputEditTextCode.isEnabled = true
      }
      binding.calenderEditable.setOnClickListener {
          binding.textInputEditTextCalender.isEnabled = true
      }


  }
}