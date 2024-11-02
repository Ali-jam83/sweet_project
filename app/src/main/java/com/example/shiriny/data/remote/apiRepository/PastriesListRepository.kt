package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.AllPastriesModel
import com.example.shiriny.data.remote.dataModel.ListPastriesModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query


interface PastryListApiService {

    @GET("cat/{id}")
    fun getPastries(
        @Path(value = "id", encoded = false) ID: Int,
        @Query("has_pastries") hasPastries: Boolean
    ): Call<ListPastriesModel>

    @GET("pastries")
    fun getPastriesByType(
        @Query("orderBy") type: String
    ): Call<AllPastriesModel>

    @GET("pastries")
    fun getFavoritePastries(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Query("favorite") favorite: Boolean
    ): Call<AllPastriesModel>

}