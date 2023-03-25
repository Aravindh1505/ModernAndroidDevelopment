package com.aravindh.androidcore.vehicle

import javax.inject.Inject

class Remote @Inject constructor() {

    fun remoteStart(car: Car) {
        println("Car started from remote")
    }
}