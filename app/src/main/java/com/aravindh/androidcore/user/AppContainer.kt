package com.aravindh.androidcore.user

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AppContainer {

    private val gson = Gson()

    private val loginService: LoginService = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(LoginService::class.java)

    private val userLocalDataSource = UserLocalDataSource(gson)

    private val userRemoteDataSource = UserRemoteDataSource(loginService)

    val userRepository = UserRepository(userLocalDataSource, userRemoteDataSource)

}