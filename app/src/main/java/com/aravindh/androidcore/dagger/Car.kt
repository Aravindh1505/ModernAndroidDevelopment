package com.aravindh.androidcore.dagger

import com.aravindh.androidcore.logger
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {

    fun drive() {
        logger("Car Driving...")
    }
}