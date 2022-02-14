package com.vaca.subtableroom

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.vaca.subtableroom.Msgdata


@Dao
interface MsgDao {
    @Query("SELECT * FROM Msgdata")
    fun getAll(): List<Msgdata>

    @Query("SELECT * FROM Msgdata WHERE date>:time ORDER BY date DESC")
    fun getAllR(time:Long): List<Msgdata>

    @Query("SELECT * FROM Msgdata WHERE date>:time ORDER BY date ASC")
    fun getAllRR(time:Long): List<Msgdata>

    @Insert
    fun insert(vararg item: Msgdata)

    @Delete
    fun delete(Msgdata: Msgdata)

    @Query("DELETE FROM Msgdata WHERE date = :myDate")
    fun deleteByDate(myDate: Long)


    @Query("DELETE FROM Msgdata")
    fun delete()
}