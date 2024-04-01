package com.example.pixels.Model.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PrescriptionsDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inputPrescription(p: PrescriptionsTable)

    @Query("SELECT *FROM PrescriptionsTable ORDER BY dateAddedInMillis DESC")
    fun getAllPrescriptions(): Flow<List<PrescriptionsTable>>

}