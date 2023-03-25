package com.aravindh.androidcore.di

import com.aravindh.androidcore.MainActivity
import com.aravindh.androidcore.vehicle.Car
import dagger.Component
import javax.inject.Singleton

@Component(modules = [WheelsModule::class, EngineModule::class])
interface CarComponent {

    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}