package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) : Engine {

    override fun start() {
        logger("Petrol engine started and horsePower is $horsePower " +
                    "engineCapacity $engineCapacity"
        )
    }
}