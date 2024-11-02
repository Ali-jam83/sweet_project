package com.example.shiriny.data.remote.apiRepository


import com.example.shiriny.data.remote.dataModel.Address
import com.example.shiriny.data.remote.dataModel.DefaultModel
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path


interface AddressApiService {

    @GET("user/address")
   suspend fun getAddress(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String
    ): Call<Address>

    @DELETE("user/address/{id}")
    fun deleteAddress(
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Header("app-api-key") apiKey: String,
        @Path(value = "id", encoded = false) ID: Int
    ): Call<Address>

    @FormUrlEncoded
    @POST("user/address/{id}")
    fun editAddress(
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Header("app-api-key") apiKey: String,
        @Field("address") address: String,
        @Field("receiver") receiver: String,
        @Field("phone") phone: String,
        @Path(value = "id", encoded = false) ID: String
    ): Call<DefaultModel>

    @FormUrlEncoded
    @POST("user/address")
    fun addAddress(
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Header("app-api-key") apiKey: String,
        @Field("address") address: String,
        @Field("receiver") receiver: String,
        @Field("phone") phone: String
    ): Call<DefaultModel>

}