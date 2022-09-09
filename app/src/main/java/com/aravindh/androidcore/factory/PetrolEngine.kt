package com.aravindh.androidcore.factory

import com.aravindh.androidcore.logger
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        logger("Petrol engine started...")
    }
}