package com.aravindh.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.factory.Car
import com.aravindh.androidcore.di.DaggerCarComponent
import com.aravindh.androidcore.di.DieselEngineModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var car : Car

    @Inject lateinit var carTemp : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(-1)
            .build()


        carComponent.inject(this)

        car.drive()
        carTemp.drive()
    }
}