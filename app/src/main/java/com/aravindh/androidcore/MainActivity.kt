package com.aravindh.androidcore

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

fun logger(message: String) {
    Log.d(TAG, message)
}

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handler = CoroutineExceptionHandler{ _ , throwable ->
            logger("Exception caughted ${throwable.message}")
        }

        CoroutineScope(Dispatchers.IO + handler).launch {
            supervisorScope {

                launch {
                    delay(1000L)
                    throw Exception("First coroutine error")
                }

                launch {
                    delay(1000L)
                    logger("second coroutine success")
                }

                launch {
                    delay(1000L)
                    throw Exception("Third coroutine error")
                }
            }
        }

    }

    suspend fun networkCall1(): String {
        delay(8000L)
        return "This is answer for network call 1"
    }

    suspend fun networkCall2(): String {
        delay(2000L)
        return "This is answer for network call 2"
    }

}