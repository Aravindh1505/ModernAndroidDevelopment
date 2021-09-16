package com.aravindh.androidcore.di

import com.aravindh.androidcore.custom.CustomAlertDialog
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class CustomComponentModule {

    @Singleton
    @Provides
    fun provideCustomAlertDialog(): CustomAlertDialog {
        return CustomAlertDialog()
    }
}