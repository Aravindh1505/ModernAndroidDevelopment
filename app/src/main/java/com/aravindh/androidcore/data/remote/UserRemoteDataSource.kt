package com.aravindh.androidcore.data.remote

import com.aravindh.androidcore.domain.ApiService
import retrofit2.Retrofit
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun getQuestions() = apiService.getQuestions()

}