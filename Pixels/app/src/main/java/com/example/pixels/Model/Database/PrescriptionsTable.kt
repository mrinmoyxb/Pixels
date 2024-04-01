package com.example.pixels.Model.Database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity
data class PrescriptionsTable(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val heading: String,
    val doctorDigitalSignature: String,
    val clinicalFindings: String,
    val medicine: String,
    val advice: String,

    val formattedDate: String,
    @TypeConverters
    val dateAddedInMillis: Long,

)
