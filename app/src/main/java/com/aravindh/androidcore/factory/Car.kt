package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,
                              private val wheels: Wheels,
                              private val driver: Driver) {

    fun drive() {
        logger("Car Driving driver $driver $this")
    }


    @Inject
    fun enableRemote(remote: Remote) {
        engine.start()
        remote.remoteStart(this)
    }
}