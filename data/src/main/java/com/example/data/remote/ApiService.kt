package com.example.data.remote

import com.example.domain.NetworkResult
import com.example.domain.model.User
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiService {

    @POST("nothing")
    suspend fun uploadData(@Body userList: List<User?>): NetworkResult<Unit>


}