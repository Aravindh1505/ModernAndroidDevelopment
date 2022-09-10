package com.aravindh.androidcore.di

import com.aravindh.androidcore.MainActivity
import com.aravindh.androidcore.factory.Car
import com.aravindh.androidcore.factory.PetrolEngine
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build() : CarComponent

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower : Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity : Int) : Builder

    }
}