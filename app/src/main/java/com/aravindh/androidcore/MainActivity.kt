package com.aravindh.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.dagger.Car
import com.aravindh.androidcore.di.DaggerCarComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }
}