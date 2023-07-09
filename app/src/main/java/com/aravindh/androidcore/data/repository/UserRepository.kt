package com.aravindh.androidcore.data.repository

import com.aravindh.androidcore.data.local.UserLocalDataSource
import com.aravindh.androidcore.data.remote.UserRemoteDataSource
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {
}