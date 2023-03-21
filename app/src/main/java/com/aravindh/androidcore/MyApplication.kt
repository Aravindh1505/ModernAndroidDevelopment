package com.aravindh.androidcore


import android.app.Application
import com.aravindh.androidcore.user.AppContainer
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {

    val appContainer = AppContainer()
}