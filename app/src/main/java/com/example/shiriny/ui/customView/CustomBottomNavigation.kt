package com.example.shiriny.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.shiriny.R
import com.example.shiriny.databinding.CustomBottemNavigationBinding
import com.example.shiriny.utils.NavType
import com.example.shiriny.utils.NavUtilsM

class CustomBottomNavigation(
    context: Context,
    attr: AttributeSet
) : FrameLayout(context, attr) {
    private val binding = CustomBottemNavigationBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)

    }

    // اینجا در ورودی اومدم اینترفیس گرفتم چون میواستم تایپ  اون دکمه ایی که کلید خورد رو بدم به ویو و بعدش ویو بیاد بده به ست فرگمنت که در اکتیویتی نوشته شده
    fun initNav(setFragment:NavUtilsM) {

        activeButton(NavType.MAIN)
        setFragment.setFragmentNav(NavType.MAIN)

        binding.viewHome.setOnClickListener {
            activeButton(NavType.HOME)
            setFragment.setFragmentNav(NavType.HOME)

        }

        binding.viewMain.setOnClickListener {
            activeButton(NavType.MAIN)
            setFragment.setFragmentNav(NavType.MAIN)

        }

        binding.viewProfile.setOnClickListener {
            activeButton(NavType.PROFILE)
            setFragment.setFragmentNav(NavType.PROFILE)

        }

        binding.viewCakes.setOnClickListener {
            activeButton(NavType.CAKES)
            setFragment.setFragmentNav(NavType.CAKES)
        }

        binding.viewShopping.setOnClickListener {
            activeButton(NavType.SHOPPING)
            setFragment.setFragmentNav(NavType.SHOPPING)

        }
    }
// این فانکشن وظیفه ست کردن بک گراند و... ایتم های نویگشین رو دارد
    private fun activeButton(type: NavType) {

        when(type) {
            NavType.HOME -> {
                binding.topOfHome.visibility = VISIBLE
                binding.topOfMain.visibility = INVISIBLE
                binding.topOfCakes.visibility = INVISIBLE
                binding.topOfProfile.visibility = INVISIBLE

                binding.viewHome.setBackgroundResource(R.drawable.back_item_nav)
                binding.viewMain.background = null
                binding.viewCakes.background = null
                binding.viewProfile.background = null

            }

            NavType.CAKES -> {

                binding.topOfHome.visibility = INVISIBLE
                binding.topOfMain.visibility = INVISIBLE
                binding.topOfCakes.visibility = VISIBLE
                binding.topOfProfile.visibility = INVISIBLE

                binding.viewHome.background = null
                binding.viewMain.background = null
                binding.viewCakes.setBackgroundResource(R.drawable.back_item_nav)
                binding.viewProfile.background = null

            }

            NavType.MAIN -> {
                binding.topOfHome.visibility = INVISIBLE
                binding.topOfMain.visibility = VISIBLE
                binding.topOfCakes.visibility = INVISIBLE
                binding.topOfProfile.visibility = INVISIBLE

                binding.viewHome.background = null
                binding.viewMain.setBackgroundResource(R.drawable.back_item_nav)
                binding.viewCakes.background = null
                binding.viewProfile.background = null



            }

            NavType.PROFILE -> {
                binding.topOfHome.visibility = INVISIBLE
                binding.topOfMain.visibility = INVISIBLE
                binding.topOfCakes.visibility = INVISIBLE
                binding.topOfProfile.visibility = VISIBLE

                binding.viewHome.background = null
                binding.viewMain.background = null
                binding.viewCakes.background = null
                binding.viewProfile.setBackgroundResource(R.drawable.back_item_nav)


            }

            NavType.SHOPPING -> {

                binding.topOfHome.visibility = INVISIBLE
                binding.topOfMain.visibility = INVISIBLE
                binding.topOfCakes.visibility = INVISIBLE
                binding.topOfProfile.visibility = INVISIBLE

                binding.viewHome.background = null
                binding.viewMain.background = null
                binding.viewCakes.background = null
                binding.viewProfile.background = null


            }
        }


    }


}