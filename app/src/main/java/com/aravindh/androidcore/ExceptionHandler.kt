package com.aravindh.androidcore

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ExceptionHandler  {

    val handler = CoroutineExceptionHandler{ _ , throwable ->
        logger("Exception caughted ${throwable.message}")
    }

    fun makeNetworkCall(){
        GlobalScope.launch(handler) {
            throw Exception("Error")
        }
    }

}