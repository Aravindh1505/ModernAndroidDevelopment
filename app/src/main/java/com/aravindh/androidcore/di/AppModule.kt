package com.aravindh.androidcore.di

import com.aravindh.androidcore.data.local.LocalDataSource
import com.aravindh.androidcore.data.remote.RemoteDataSource
import com.aravindh.androidcore.repository.MainRepository
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideGson() = GsonBuilder().create()

    @Singleton
    @Provides
    fun provideMainRepository(
        remoteDataSource: RemoteDataSource,
        localDataSource: LocalDataSource
    ): MainRepository {
        return MainRepository(
            remoteDataSource,
            localDataSource
        )
    }
}