package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        logger("Diesel engine started...")
    }
}