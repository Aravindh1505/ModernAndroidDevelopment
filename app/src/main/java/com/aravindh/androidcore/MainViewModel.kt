package com.aravindh.androidcore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var name = MutableLiveData("")

    fun updateName(newName: String) {
        name.value = newName
    }
}