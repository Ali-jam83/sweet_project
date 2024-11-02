package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.RequestMain
import retrofit2.Response
import retrofit2.http.GET


interface MainApiService {

    @GET("main")
    suspend fun getContent(): Response<RequestMain>

}