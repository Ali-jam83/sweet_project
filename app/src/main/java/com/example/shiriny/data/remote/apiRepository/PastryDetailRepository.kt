package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.DefaultModel
import com.example.shiriny.data.remote.dataModel.PastryMainModel
import com.example.shiriny.data.remote.dataModel.RequestFavorite
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path


interface PastryApiService {

    @GET("pastry/{id}")
    fun getPastry(
        @Path(value = "id", encoded = false) ID: Int,
        @Header("app-device-uid") uId: String,
        @Header("app-public-key") pubKey: String,
        @Header("app-api-key") apiKey: String
    ): Call<PastryMainModel>

    @FormUrlEncoded
    @POST("pastry/{id}/operations/")
    fun setPastryFavorite(
        @Path(value = "id", encoded = false) pastryId: Int,
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Field("action") action: String
    ): Call<RequestFavorite>

    @FormUrlEncoded
    @POST("comment/")
    fun setPastryComment(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Field("post_id") post_id: Int,
        @Field("content") content: String,
        @Field("rate") rate: Float
    ): Call<DefaultModel>

}

