package com.aravindh.androidcore.vehicle.engine

import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun engineType(): String {
        return "Petrol Engine"
    }
}