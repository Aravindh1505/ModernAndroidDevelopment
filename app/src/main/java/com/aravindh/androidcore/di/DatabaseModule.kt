package com.aravindh.androidcore.di

import android.content.Context
import com.aravindh.androidcore.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext applicationContext: Context) =
        AppDatabase.getDatabase(applicationContext)

    @Singleton
    @Provides
    fun provideMainDao(appDatabase: AppDatabase) = appDatabase.appDao()

}