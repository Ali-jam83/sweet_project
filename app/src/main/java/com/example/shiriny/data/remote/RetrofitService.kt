package com.example.shiriny.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private val url_app = "https://pastry.alirezaahmadi.info/api/v1/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(url_app)
        .addConverterFactory(GsonConverterFactory.create())
        .build()




}