package com.aravindh.androidcore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.R
import com.aravindh.androidcore.data.local.UserLocalDataSource
import com.aravindh.androidcore.data.remote.UserRemoteDataSource
import com.aravindh.androidcore.data.repository.UserRepository
import com.aravindh.androidcore.domain.ApiService
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://opentdb.com/api.php/")
            .build()
            .create(ApiService::class.java)

        val localDataSource = UserLocalDataSource()
        val remoteDataSource = UserRemoteDataSource(retrofit)
        val userRepository = UserRepository(localDataSource, remoteDataSource)
        val viewModel = MainViewModel(userRepository)

        val appName = viewModel.getAppName()
        println("App Name: $appName")

    }
}