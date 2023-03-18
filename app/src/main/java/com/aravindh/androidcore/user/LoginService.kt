package com.aravindh.androidcore.user

import retrofit2.Response
import retrofit2.http.GET

interface LoginService {

    @GET("/todos")
    suspend fun getData(): Response<TodoResponse>
}