package com.example.myapplication.Model.Database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class FinanceTable(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val amount: Double,
    val type: String,
    val description: String,
    val isExpense: Boolean,
    val isEarning: Boolean,
    val dateAdded: Date
)
