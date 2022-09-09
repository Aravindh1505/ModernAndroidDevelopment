package com.aravindh.androidcore.di

import com.aravindh.androidcore.MainActivity
import com.aravindh.androidcore.factory.Car
import com.aravindh.androidcore.factory.PetrolEngine
import dagger.Component


@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}