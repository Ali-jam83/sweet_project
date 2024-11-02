package com.example.shiriny.data.remote.apiRepository

import com.example.shiriny.data.remote.dataModel.AllPastriesModel
import com.example.shiriny.data.remote.dataModel.ListPastriesModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query


interface PastryListApiService {

    @GET("cat/{id}")
    suspend fun getPastries(
        @Path(value = "id", encoded = false) ID: Int,
        @Query("has_pastries") hasPastries: Boolean
    ): Response<ListPastriesModel>

    @GET("pastries")
    suspend fun getPastriesByType(
        @Query("orderBy") type: String
    ): Response<AllPastriesModel>

    @GET("pastries")
   suspend fun getFavoritePastries(
        @Header("app-api-key") apiKey: String,
        @Header("app-device-uid") id: String,
        @Header("app-public-key") pubKey: String,
        @Query("favorite") favorite: Boolean
    ): Response<AllPastriesModel>

}