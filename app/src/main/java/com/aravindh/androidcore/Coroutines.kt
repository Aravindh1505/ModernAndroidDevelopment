package com.aravindh.androidcore

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking {
    coroutineVsThread()
}

private fun CoroutineScope.coroutineVsThread() {
    repeat(100_00) {
        launch {
            delay(1000)
            print(" @ ")
        }

        /*thread {
            Thread.sleep(1000)
            print(" @ ")
        }*/
    }
}

suspend fun doWork() = coroutineScope {

    launch {
        delay(2000)
        println("World 2")
    }

    launch {
        delay(1000)
        println("World 1")
    }

    println("Hello")
}