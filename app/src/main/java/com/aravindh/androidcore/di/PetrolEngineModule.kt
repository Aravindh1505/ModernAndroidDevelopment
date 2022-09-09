package com.aravindh.androidcore.di

import com.aravindh.androidcore.factory.Engine
import com.aravindh.androidcore.factory.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine) : Engine
}