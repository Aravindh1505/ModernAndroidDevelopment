package com.aravindh.androidcore.data.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "world_response")
data class WorldResponse(
    @PrimaryKey
    val updated: Long?, // 1631805226287
    val active: Int?, // 18625665
    val activePerOneMillion: Int?, // 2372.61
    val affectedCountries: Int?, // 223
    val cases: Int?, // 227464827
    val casesPerOneMillion: Int?, // 29182
    val critical: Int?, // 101361
    val criticalPerOneMillion: Double?, // 12.91
    val deaths: Int?, // 4677001
    val deathsPerOneMillion: Int?, // 600
    val oneCasePerPeople: Int?, // 0
    val oneDeathPerPeople: Int?, // 0
    val oneTestPerPeople: Int?, // 0
    val population: Long?, // 7850268914
    val recovered: Int?, // 204162161
    val recoveredPerOneMillion: Double?, // 26007.03
    val tests: Long?, // 3536599592
    val testsPerOneMillion: Double?, // 450506.81
    val todayCases: Int?, // 239441
    val todayDeaths: Int?, // 4519
    val todayRecovered: Int? // 249387
)