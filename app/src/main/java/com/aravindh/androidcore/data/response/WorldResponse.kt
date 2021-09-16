package com.aravindh.androidcore.data.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "world_response")
data class WorldResponse(
    @PrimaryKey
    val updated: Long?, // 1631805226287
    val active: Double?, // 18625665
    val activePerOneMillion: Double?, // 2372.61
    val affectedCountries: Double?, // 223
    val cases: Double?, // 227464827
    val casesPerOneMillion: Double?, // 29182
    val critical: Double?, // 101361
    val criticalPerOneMillion: Double?, // 12.91
    val deaths: Double?, // 4677001
    val deathsPerOneMillion: Double?, // 600
    val oneCasePerPeople: Double?, // 0
    val oneDeathPerPeople: Double?, // 0
    val oneTestPerPeople: Double?, // 0
    val population: Long?, // 7850268914
    val recovered: Double?, // 204162161
    val recoveredPerOneMillion: Double?, // 26007.03
    val tests: Long?, // 3536599592
    val testsPerOneMillion: Double?, // 450506.81
    val todayCases: Double?, // 239441
    val todayDeaths: Double?, // 4519
    val todayRecovered: Double? // 249387
)