package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.DefaultModel
import com.example.shiriny.data.remote.dataModel.UserInfoData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface UserApiService {

    @GET("auth/heartbeat")
   suspend fun getUserInfo(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String
    ): Response<UserInfoData>

    @FormUrlEncoded
    @POST("user/profile")
   suspend fun setUserInfo(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Field("fullname") fullName: String,
        @Field("email") email: String,
        @Field("day") day: String,
        @Field("month") month: String,
        @Field("year") year: String,
        @Field("sex") sex: Int
    ):Response<DefaultModel>

}

interface StartSetUserInfo {

    fun startSetUser(
        name: String,
        email: String,
        day: String,
        month: String,
        year: String,
        sex: Int
    )

}