package com.vaca.subtableroom

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Msgdata::class], version = 1)
abstract class MsgAppDatabase : RoomDatabase() {
    abstract fun msgDao(): MsgDao
}