package com.aravindh.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.dagger.Car
import com.aravindh.androidcore.dagger.Remote
import com.aravindh.androidcore.di.DaggerCarComponent
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)

        car.drive()
    }
}