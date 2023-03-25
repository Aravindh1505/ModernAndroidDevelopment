package com.aravindh.androidcore.di

import com.aravindh.androidcore.vehicle.engine.DieselEngine
import com.aravindh.androidcore.vehicle.engine.Engine
import com.aravindh.androidcore.vehicle.engine.PetrolEngine
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class EngineModule {

    @Binds
    @Named("petrolEngine")
    abstract fun bindPetrolEngine(engine: PetrolEngine): Engine

    @Binds
    @Named("dieselEngine")
    abstract fun bindDieselEngine(engine: DieselEngine) : Engine
}