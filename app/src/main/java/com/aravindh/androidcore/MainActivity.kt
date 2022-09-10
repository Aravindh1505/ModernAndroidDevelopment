package com.aravindh.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.factory.Car
import com.aravindh.androidcore.di.DaggerCarComponent
import com.aravindh.androidcore.di.DieselEngineModule
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = (application as MyApplication).getCarComponent()
//        val carComponent = application.getCarComponent()

        carComponent.inject(this)

        car.drive()
    }
}