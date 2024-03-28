package com.example.myapplication.Model.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.sql.Date

@Entity
data class FinanceTable(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val amount: Double,
    val type: String,
    val description: String,

    // 1 for True and 0 for False
    val isEarnings: Int,

    // dates
    val formattedDate: String,
    @TypeConverters
    val dateAddedInMillis: Long
)
