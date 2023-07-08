package com.aravindh.androidcore.data.repository

import com.aravindh.androidcore.data.local.UserLocalDataSource
import com.aravindh.androidcore.data.remote.UserRemoteDataSource

class UserRepository(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {
}