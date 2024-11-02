package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.DefaultModel
import com.example.shiriny.data.remote.dataModel.RequestSendPhone
import com.example.shiriny.data.remote.dataModel.RequestVerifyCode
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST


interface LoginApiService {

    @FormUrlEncoded
    @POST("auth/phone/login")
    fun sendPhone(
        @Header("app-device-uid") id: String,
        @Header("app-public-key") key: String,
        @Field("phone") phone: String
    ): Call<RequestSendPhone>

    @FormUrlEncoded
    @POST("auth/phone/login/verify")
    fun verifyCode(
        @Field("code") code: String,
        @Field("phone") phone: String
    ): Call<RequestVerifyCode>

    @FormUrlEncoded
    @POST("user/profile")
    fun editUser(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Field("fullname") fullName: String
    ): Call<DefaultModel>

}