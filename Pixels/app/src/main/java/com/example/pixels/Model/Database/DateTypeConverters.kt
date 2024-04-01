package com.example.pixels.Model.Database

import androidx.room.TypeConverter
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

class DateTypeConverters {

        @TypeConverter
        fun fromTimestamp(value: Long?): String? {
            if (value == null) {
                return null
            }
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            sdf.timeZone = TimeZone.getDefault()
            return sdf.format(Date(value))
        }

        @TypeConverter
        fun toTimestamp(value: String?): Long? {
            if (value == null) {
                return null
            }
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            sdf.timeZone = TimeZone.getDefault()
            return try {
                sdf.parse(value)?.time
            } catch (e: Exception) {
                null
            }
        }
    }
