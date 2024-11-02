package com.example.shiriny.data.remote.apiRepository


import com.example.shiriny.data.remote.dataModel.ParentCategoryModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.*



interface CatsApiService {

    @GET("cats")
   suspend fun getCats(@Query("pastry_type") type: String): Response<ParentCategoryModel>

}