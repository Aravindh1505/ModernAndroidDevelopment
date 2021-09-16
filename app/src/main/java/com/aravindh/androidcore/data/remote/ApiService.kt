package com.aravindh.androidcore.data.remote

import com.aravindh.androidcore.data.response.WorldResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("all")
    suspend fun getData(): Response<WorldResponse>
}