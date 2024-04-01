package com.example.pixels.Model.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [PrescriptionsTable::class], version = 1, exportSchema = false)
@TypeConverters(DateTypeConverters::class)
abstract class PrescriptionsDatabase : RoomDatabase() {
    abstract fun prescriptionDao(): PrescriptionsDao

    companion object {
        private const val DATABASE_NAME = "prescriptions-database"

        @Volatile
        private var instance: PrescriptionsDatabase? = null

        fun getInstance(context: Context): PrescriptionsDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): PrescriptionsDatabase {
            return Room.databaseBuilder(context, PrescriptionsDatabase::class.java, DATABASE_NAME)
                .build()
        }
    }
}