package com.example.shiriny.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shiriny.mvp.presenter.PresenterInfoUserFragment
import com.example.shiriny.mvp.view.ViewInfoUserFragment


class InfoUserFragment(
    private val contextM: Context
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewM = ViewInfoUserFragment(contextM)

        val presenter = PresenterInfoUserFragment(viewM)
        presenter.onCreate()

        return viewM.binding.root
    }

}