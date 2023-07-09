package com.aravindh.androidcore.domain

import com.aravindh.androidcore.data.local.UserLocalDataSource
import com.aravindh.androidcore.data.remote.UserRemoteDataSource
import com.aravindh.androidcore.data.repository.UserRepository
import retrofit2.Retrofit

class AppContainer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://opentdb.com/api.php/")
        .build()
        .create(ApiService::class.java)

    private val localDataSource = UserLocalDataSource()
    private val remoteDataSource = UserRemoteDataSource(retrofit)
    val userRepository = UserRepository(localDataSource, remoteDataSource)
    
}