package com.example.shiriny.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shiriny.mvp.presenter.PresenterAddressFragment
import com.example.shiriny.mvp.presenter.PresenterMyNotificationFragment
import com.example.shiriny.mvp.view.ViewAddressFragment
import com.example.shiriny.mvp.view.ViewMyNotificationFragment

class MyAddressFragment(
   private val contextM : Context
) :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewM = ViewAddressFragment(contextM)
        val  presenter = PresenterAddressFragment(viewM)
        presenter.onCreate()

        return viewM.binding.root
    }
}