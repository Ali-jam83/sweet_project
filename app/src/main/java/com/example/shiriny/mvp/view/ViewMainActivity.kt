package com.example.shiriny.mvp.view

import android.content.Context
import android.view.LayoutInflater
import com.example.shiriny.databinding.ActivityMainBinding
import com.example.shiriny.mvp.ext.ActivityUtils
import com.example.shiriny.ui.fragment.CakesFragment
import com.example.shiriny.ui.fragment.HomeFragment
import com.example.shiriny.ui.fragment.MainFragment
import com.example.shiriny.ui.fragment.NotificationFragment
import com.example.shiriny.ui.fragment.ProfileFragment
import com.example.shiriny.ui.fragment.ShoppingFragment
import com.example.shiriny.utils.NavType
import com.example.shiriny.utils.NavUtilsM

class ViewMainActivity(
    private val context: Context,
    private val utils: ActivityUtils
) {

    val binding = ActivityMainBinding.inflate(LayoutInflater.from(context))


    fun initNavigation() {
        binding.customBottomNavigation.initNav(object : NavUtilsM {
            override fun setFragmentNav(type: NavType) {

                val fragment = when (type) {
                    NavType.HOME -> HomeFragment(context)
                    NavType.MAIN -> MainFragment(context)
                    NavType.CAKES -> CakesFragment(context)
                    NavType.PROFILE -> ProfileFragment(context)
                    NavType.SHOPPING -> ShoppingFragment(context)
                }

                utils.setFragment(fragment)
            }
        })
    }

    fun initToolbar() {

    }

}