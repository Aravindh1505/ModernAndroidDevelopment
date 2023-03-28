package com.aravindh.androidcore.vehicle

import com.aravindh.androidcore.vehicle.engine.Engine
import com.aravindh.androidcore.vehicle.engine.PetrolEngine
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(
    private val wheels: Wheels,
    private val engine: PetrolEngine
) {

    fun drive() {
        engine.start()
        println("Driving...")
    }

    @Inject
    fun remoteStart(remote: Remote) {
        remote.remoteStart(this)
    }

    fun warrantyStartDate(): String = wheels.warrantyStartDate()

    fun engineType(): String = engine.engineType()
}
