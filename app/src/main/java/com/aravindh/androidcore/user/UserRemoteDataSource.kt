package com.aravindh.androidcore.user

import retrofit2.Response
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor (
    private val loginService: LoginService
) {
    suspend fun getData(): Response<TodoResponse> {
        return loginService.getData()
    }
}