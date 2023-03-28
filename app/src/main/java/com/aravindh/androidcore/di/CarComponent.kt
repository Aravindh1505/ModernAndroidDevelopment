package com.aravindh.androidcore.di

import com.aravindh.androidcore.MainActivity
import com.aravindh.androidcore.vehicle.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Component(modules = [WheelsModule::class, EngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsePower") hp: Int): Builder

        @BindsInstance
        fun capacity(@Named("capacity") capacity: Int): Builder

        fun build(): CarComponent
    }
}