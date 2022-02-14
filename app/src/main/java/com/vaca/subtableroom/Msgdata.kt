package com.vaca.subtableroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Msgdata(
    @PrimaryKey val date: Long,
    @ColumnInfo(name = "dateString") val dateString: String,
    @ColumnInfo(name = "note") val note: String,
)