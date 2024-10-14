package com.example.shiriny.mvp.presenter

import com.example.shiriny.mvp.ext.BaseLifeCycleActivity
import com.example.shiriny.mvp.view.ViewMainActivity

class PresenterMainActivity(
    val view: ViewMainActivity
) : BaseLifeCycleActivity {

    override fun onCreate() {
        navInit()
        toolInit()
    }
    private fun navInit(){
        view.initNavigation()

    }

    private fun toolInit(){
        view.initToolbar()

    }
}