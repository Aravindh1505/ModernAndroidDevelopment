package com.aravindh.androidcore.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.MyApplication
import com.aravindh.androidcore.R
import com.aravindh.androidcore.data.local.UserLocalDataSource
import com.aravindh.androidcore.data.remote.UserRemoteDataSource
import com.aravindh.androidcore.data.repository.UserRepository
import com.aravindh.androidcore.domain.ApiService
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = viewModel.getAppName()
        println("App Name: $appName")

    }
}