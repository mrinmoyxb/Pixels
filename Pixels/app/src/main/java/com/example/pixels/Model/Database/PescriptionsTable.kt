package com.example.pixels.Model.Database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class PescriptionsTable(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val heading: String,
    val doctorDigitalSignature: String,
    val date: Date,
    val description: String,
)
