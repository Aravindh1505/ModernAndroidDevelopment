package com.aravindh.androidcore.di

import com.aravindh.androidcore.factory.DieselEngine
import com.aravindh.androidcore.factory.Engine
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck


@Module
@DisableInstallInCheck
abstract class DieselEngineModule {

    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}