package com.example.myapplication.Model.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [FinanceTable::class], version = 1, exportSchema = false)
@TypeConverters(DateTypeConverters::class)
abstract class TransactionDatabase : RoomDatabase() {
    abstract fun financeDao(): FinanceTableDao

    companion object {
        private const val DATABASE_NAME = "BudgetBuddy-database"

        private const val QUERY_MAX_EXPENDITURE =
            """"SELECT MAX(amount) FROM FinanceTable\n" +
                    "WHERE strftime('%Y', dateAddedInMillis / 1000) = strftime('%Y', CURRENT_TIMESTAMP / 1000)\n" +
                    "  AND strftime('%m', dateAddedInMillis / 1000) = strftime('%m', CURRENT_TIMESTAMP / 1000)\n" +
                    "  AND isEarnings = 0"""

        @Volatile
        private var instance: TransactionDatabase? = null

        fun getInstance(context: Context): TransactionDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): TransactionDatabase {
            return Room.databaseBuilder(context, TransactionDatabase::class.java, DATABASE_NAME)
                .build()
        }
    }
}