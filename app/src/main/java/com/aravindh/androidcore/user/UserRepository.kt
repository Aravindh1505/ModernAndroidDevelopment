package com.aravindh.androidcore.user

import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) {

    suspend fun getStatus(): Response<TodoResponse> {
        val response = userRemoteDataSource.getData()
        userLocalDataSource.saveData(response.body())
        return response
    }

}