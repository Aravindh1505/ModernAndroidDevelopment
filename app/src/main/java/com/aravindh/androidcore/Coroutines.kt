package com.aravindh.androidcore

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {

    println("Main Program Start ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Thread Program Start ${Thread.currentThread().name}")
        delay(1000L)
        println("Thread Program Start ${Thread.currentThread().name}")
    }

    delay(2000)
    println("Main Program End ${Thread.currentThread().name}")

}