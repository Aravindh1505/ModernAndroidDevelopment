package com.aravindh.androidcore

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking {

    println("Main Program Start ${Thread.currentThread().name}")

    val job : Deferred<String> = async {
        println("Thread Program Start ${Thread.currentThread().name}")
        delay(2000L)
        println("Thread Program Start ${Thread.currentThread().name}")
        "Aravindh"
    }

    val output = job.await()
    println("output: $output")
    println("Main Program End ${Thread.currentThread().name}")

}