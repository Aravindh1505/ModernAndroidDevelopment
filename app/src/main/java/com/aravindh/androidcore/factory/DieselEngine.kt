package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class DieselEngine @Inject constructor(val horsePower : Int) : Engine {



    override fun start() {
        logger("Diesel engine started and horsePower is : $horsePower")
    }
}