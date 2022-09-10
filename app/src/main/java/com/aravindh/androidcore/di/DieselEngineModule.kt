package com.aravindh.androidcore.di

import com.aravindh.androidcore.factory.DieselEngine
import com.aravindh.androidcore.factory.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import kotlin.properties.Delegates


@Module
@DisableInstallInCheck
class DieselEngineModule constructor(private var horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}