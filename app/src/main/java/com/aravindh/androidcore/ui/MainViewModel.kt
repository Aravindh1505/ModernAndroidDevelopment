package com.aravindh.androidcore.ui

import androidx.lifecycle.ViewModel
import com.aravindh.androidcore.data.repository.UserRepository

class MainViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getAppName(): String = "Android"
}