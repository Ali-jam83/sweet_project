package com.example.shiriny.utils

enum class NavType{
    HOME,
    MAIN,
    CAKES,
    PROFILE,
    SHOPPING
}

interface NavUtilsM {

     fun setFragmentNav ( type: NavType) {}

}




