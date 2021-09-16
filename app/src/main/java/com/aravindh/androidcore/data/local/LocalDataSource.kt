package com.aravindh.androidcore.data.local

import com.aravindh.androidcore.data.remote.BaseDataSource
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val appDao: AppDao
) : BaseDataSource() {

    fun insert() {
        //appDao.insert()
    }
}