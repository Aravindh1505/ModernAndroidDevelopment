package com.aravindh.androidcore.di

import com.aravindh.androidcore.vehicle.Rims
import com.aravindh.androidcore.vehicle.Tires
import com.aravindh.androidcore.vehicle.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires: Tires = Tires()
        tires.inflateTires()
        return tires
    }

    @Provides
    fun provideWheels(tires: Tires, rims: Rims): Wheels {
        return Wheels(tires, rims)
    }
}