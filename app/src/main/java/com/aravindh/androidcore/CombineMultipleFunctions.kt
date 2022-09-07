package com.aravindh.androidcore

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {
        val out1 = async { doSomeWork1() }
        val out2 = async { doSomeWork2() }

        val output = out1.await() + out2.await()

        println("Output $output")

        /*if (output == 77){
            val out3 = doSomeWork3()
            println("out3 $out3")
        }*/
    }


    println(time)

}

suspend fun doSomeWork1(): Int {
    delay(1000)
    return 32
}

suspend fun doSomeWork2(): Int {
    delay(2000)
    return 45
}

suspend fun doSomeWork3(): String {
    delay(1000)
    return "Response from server"
}