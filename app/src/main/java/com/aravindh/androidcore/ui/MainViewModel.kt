package com.aravindh.androidcore.ui

import androidx.lifecycle.ViewModel
import com.aravindh.androidcore.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getAppName(): String = "Android"
}