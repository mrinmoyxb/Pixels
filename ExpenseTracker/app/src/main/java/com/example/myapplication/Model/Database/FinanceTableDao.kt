package com.example.myapplication.Model.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FinanceTableDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAmount(transaction: FinanceTable)

    @Query("DELETE FROM FinanceTable WHERE id = :id")
    suspend fun deleteUser(id: Int)

    @Query("SELECT *FROM FinanceTable")
    fun getAllTransactions(): Flow<List<FinanceTable>>

    @Query("SELECT *FROM FinanceTable ORDER BY dateAdded DESC")
    fun getAllTransactionsByDate(): Flow<List<FinanceTable>>

    @Query("SELECT *FROM FinanceTable WHERE isEarnings=1")
    fun getAllEarnings(): Flow<List<FinanceTable>>

    @Query("SELECT *FROM FinanceTable WHERE isEarnings=0")
    fun getAllExpenses(): Flow<List<FinanceTable>>

    @Query("SELECT SUM(amount) FROM FinanceTable WHERE isEarnings=1")
    fun getTotalEarnings(): Flow<Double>

    @Query("SELECT SUM(amount) FROM FinanceTable WHERE isEarnings=0")
    fun getTotalExpenses(): Flow<Double>

}