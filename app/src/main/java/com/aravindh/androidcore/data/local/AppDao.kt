package com.aravindh.androidcore.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aravindh.androidcore.data.response.WorldResponse

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(worldResponse: WorldResponse)

    @Query("SELECT * FROM world_response")
    fun getWorldResponse(): WorldResponse
}