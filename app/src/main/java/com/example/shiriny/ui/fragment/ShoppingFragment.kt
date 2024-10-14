package com.example.shiriny.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shiriny.mvp.presenter.PresenterShoppingFragment
import com.example.shiriny.mvp.view.ViewShoppingFragment

class ShoppingFragment(
    private val contextM: Context
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val viewM = ViewShoppingFragment(contextM)
        val  presenter = PresenterShoppingFragment(viewM)
        presenter.onCreate()

        return viewM.binding.root
    }
}