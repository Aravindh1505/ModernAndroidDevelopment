package com.aravindh.androidcore.viewmodel

import androidx.lifecycle.ViewModel
import com.aravindh.androidcore.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(mainRepository: MainRepository) : ViewModel() {

    val data = mainRepository.getData()

    private val _username = MutableStateFlow("")
    val username: StateFlow<String> = _username


}