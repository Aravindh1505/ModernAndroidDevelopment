package com.aravindh.androidcore.di

import com.aravindh.androidcore.navigator.AppNavigator
import com.aravindh.androidcore.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppNavigatorModule {

    @Binds
    abstract fun bindNavigator(appNavigatorImpl: AppNavigatorImpl): AppNavigator
}