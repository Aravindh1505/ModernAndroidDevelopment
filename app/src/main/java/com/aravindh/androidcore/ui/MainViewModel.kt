package com.aravindh.androidcore.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aravindh.androidcore.data.model.Questions
import com.aravindh.androidcore.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getAppName(): String = "Android"

    private var _questions = MutableLiveData<Questions>()
    val questions: LiveData<Questions> = _questions

    private var _qstn = MutableSharedFlow<Questions?>()
    val qstn: Flow<Questions?> = _qstn


    init {
        viewModelScope.launch {
            //getQuestions()
            //delay(2000L)
            getQuestionsUsingFlow()
        }
    }

    private suspend fun getQuestions() {
        viewModelScope.launch {
            val questions = userRepository.getQuestions()
            println("questions :${questions.body()}")

            _questions.postValue(questions.body())
        }
    }

    private suspend fun getQuestionsUsingFlow() {
        viewModelScope.launch {
            val questions = userRepository.getQuestions().body()
            _qstn.emit(questions)
        }
    }

}