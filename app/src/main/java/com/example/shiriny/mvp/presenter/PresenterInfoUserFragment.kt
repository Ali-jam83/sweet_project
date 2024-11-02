package com.example.shiriny.mvp.presenter

import com.example.shiriny.mvp.ext.BaseLifeCycleActivity
import com.example.shiriny.mvp.view.ViewInfoUserFragment
import com.example.shiriny.mvp.view.ViewShoppingFragment

class PresenterInfoUserFragment(
    private val view : ViewInfoUserFragment
) : BaseLifeCycleActivity {

    override fun onCreate() {

        view.initView()
    }

}