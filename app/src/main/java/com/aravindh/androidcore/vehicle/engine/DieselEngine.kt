package com.aravindh.androidcore.vehicle.engine

import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override fun engineType(): String {
        return "Diesel Engine"
    }
}