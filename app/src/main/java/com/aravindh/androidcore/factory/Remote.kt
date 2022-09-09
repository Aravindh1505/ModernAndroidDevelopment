package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class Remote @Inject constructor() {

    fun remoteStart(car: Car) {
        logger("Remote start working...")
    }
}