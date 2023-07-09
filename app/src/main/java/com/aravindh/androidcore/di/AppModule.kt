package com.aravindh.androidcore.di

import com.aravindh.androidcore.domain.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideApiService() = Retrofit.Builder()
        .baseUrl("https://opentdb.com/api.php/")
        .build()
        .create(ApiService::class.java)
}