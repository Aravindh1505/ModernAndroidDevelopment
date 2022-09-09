package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {

    fun drive() {
        logger("Car Driving...")
    }


    @Inject
    fun enableRemote(remote: Remote) {
        engine.start()
        remote.remoteStart(this)
    }
}