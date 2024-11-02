package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.DefaultModel
import com.example.shiriny.data.remote.dataModel.RequestSendPhone
import com.example.shiriny.data.remote.dataModel.RequestVerifyCode
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST


interface LoginApiService {

    @FormUrlEncoded
    @POST("auth/phone/login")
    suspend fun sendPhone(
        @Header("app-device-uid") id: String,
        @Header("app-public-key") key: String,
        @Field("phone") phone: String
    ): Response<RequestSendPhone>

    @FormUrlEncoded
    @POST("auth/phone/login/verify")
   suspend fun verifyCode(
        @Field("code") code: String,
        @Field("phone") phone: String
    ): Response<RequestVerifyCode>

    @FormUrlEncoded
    @POST("user/profile")
     suspend fun editUser(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Field("fullname") fullName: String
    ): Response<DefaultModel>

}