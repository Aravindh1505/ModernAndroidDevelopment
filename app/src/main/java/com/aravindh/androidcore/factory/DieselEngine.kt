package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower : Int) : Engine {



    override fun start() {
        logger("Diesel engine started and horsePower is : $horsePower")
    }
}