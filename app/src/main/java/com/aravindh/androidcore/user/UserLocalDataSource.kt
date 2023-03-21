package com.aravindh.androidcore.user

import com.google.gson.Gson
import javax.inject.Inject

class UserLocalDataSource @Inject constructor(
    private val gson: Gson
) {

    fun saveData(body: TodoResponse?): String {
        return ""
    }
}