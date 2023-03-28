package com.aravindh.androidcore.di

import com.aravindh.androidcore.vehicle.engine.DieselEngine
import com.aravindh.androidcore.vehicle.engine.Engine
import com.aravindh.androidcore.vehicle.engine.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
abstract class EngineModule {

    @Binds
    abstract fun providePetrolEngine(engine: PetrolEngine) : Engine

}