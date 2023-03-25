package com.aravindh.androidcore.vehicle

import javax.inject.Inject

class Wheels @Inject constructor(private val tires: Tires, private val rims: Rims) {

    fun warrantyStartDate(): String {
        println("Rims Amount : ${rims.amount}")
        return "15/05/2018"
    }


}