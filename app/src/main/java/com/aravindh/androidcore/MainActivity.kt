package com.aravindh.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.di.DaggerCarComponent
import com.aravindh.androidcore.di.WheelsModule
import com.aravindh.androidcore.vehicle.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myCar: Car

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder().wheelsModule(WheelsModule(100)).build()
        carComponent.inject(this)

        myCar.drive()
        val engineType = myCar.engineType()
        val warrantyStartDate = myCar.warrantyStartDate()

        println(engineType)
        println(warrantyStartDate)


        val isSameInstance = car == myCar
        println("isSameInstance $isSameInstance")
    }
}