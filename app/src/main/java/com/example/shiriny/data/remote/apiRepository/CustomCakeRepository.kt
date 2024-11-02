package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.DefaultModel
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


interface CakeApiService {

    @Multipart
    @POST("cake")
    fun sendCakes(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Part file: List<MultipartBody.Part>,
        @Part("description") description: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("floor") floor: RequestBody
    ): Call<DefaultModel>

}