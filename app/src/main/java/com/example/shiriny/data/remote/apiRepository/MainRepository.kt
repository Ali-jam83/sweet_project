package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.RequestMain
import retrofit2.Call
import retrofit2.http.GET


interface MainApiService {

    @GET("main")
    fun getContent(): Call<RequestMain>

}