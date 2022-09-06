package com.aravindh.androidcore

fun main() {

    for (i in 2..100) {
        val output = isPrimeNumber(i)
        println(if (output) "$i is Not a Prime Number" else "$i is Prime Number")
    }
}

private fun isPrimeNumber(input: Int): Boolean {
    for (i in 2 until input) {
        if (input % i == 0) return true
    }
    return false
}