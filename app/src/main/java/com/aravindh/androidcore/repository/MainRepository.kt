package com.aravindh.androidcore.repository

import com.aravindh.androidcore.data.local.LocalDataSource
import com.aravindh.androidcore.data.performGetOperation
import com.aravindh.androidcore.data.remote.RemoteDataSource
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) {

    fun getData() = performGetOperation(
        networkCall = { remoteDataSource.getData() }
    )

}