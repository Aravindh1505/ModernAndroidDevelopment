package com.aravindh.androidcore.di

import com.aravindh.androidcore.dagger.Rims
import com.aravindh.androidcore.dagger.Tires
import com.aravindh.androidcore.dagger.Wheels
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        val rims = Rims()
        rims.getStatus()
        return rims
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.getStatus()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}