package com.aravindh.androidcore.vehicle.engine

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") val horsePower: Int,
    @Named("capacity") val capacity: Int
) : Engine {
    override fun engineType(): String {
        return "Petrol Engine $horsePower hp"
    }

    fun start() {
        println("Petrol Engine started $horsePower hp $capacity capacity")
    }
}