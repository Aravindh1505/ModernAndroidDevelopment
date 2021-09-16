package com.aravindh.androidcore.viewmodel

import androidx.lifecycle.ViewModel
import com.aravindh.androidcore.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(mainRepository: MainRepository) : ViewModel() {

    val data = mainRepository.getData()
}