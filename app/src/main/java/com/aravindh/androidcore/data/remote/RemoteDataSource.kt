package com.aravindh.androidcore.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) : BaseDataSource() {

    suspend fun getData() = getResult {
        apiService.getData()
    }
}