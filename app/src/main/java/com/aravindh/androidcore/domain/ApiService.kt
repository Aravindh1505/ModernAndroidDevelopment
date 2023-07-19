package com.aravindh.androidcore.domain

import com.aravindh.androidcore.data.model.Questions
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api.php")
    suspend fun getQuestions(
        @Query("amount") amount: String = "10",
        @Query("category") category: String = "9",
        @Query("difficulty") difficulty: String = "easy",
        @Query("type") type: String = "boolean"
    ): Response<Questions>
}