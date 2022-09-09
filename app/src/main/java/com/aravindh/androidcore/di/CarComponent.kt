package com.aravindh.androidcore.di

import com.aravindh.androidcore.MainActivity
import com.aravindh.androidcore.dagger.Car
import dagger.Component


@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}