package com.example.shiriny.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shiriny.mvp.presenter.PresenterCakesFragment
import com.example.shiriny.mvp.presenter.PresenterMainFragment
import com.example.shiriny.mvp.view.ViewCakesFragment
import com.example.shiriny.mvp.view.ViewMainFragment

class MyNotifiFragment(
    private val contextM: Context
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val viewM = ViewCakesFragment(contextM)
        val  presenter = PresenterCakesFragment(viewM)
        presenter.onCreate()

        return viewM.binding.root
    }
}