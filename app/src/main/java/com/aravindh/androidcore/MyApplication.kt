package com.aravindh.androidcore


import android.app.Application
import com.aravindh.androidcore.di.CarComponent
import com.aravindh.androidcore.di.DaggerCarComponent
import dagger.hilt.android.HiltAndroidApp


class MyApplication : Application() {

    private lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder()
            .horsePower(100)
            .engineCapacity(1500)
            .build()
    }

    fun getCarComponent(): CarComponent {
        return carComponent
    }
}