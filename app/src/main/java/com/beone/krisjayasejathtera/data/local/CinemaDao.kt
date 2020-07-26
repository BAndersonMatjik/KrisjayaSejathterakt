package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.CinemaModel

@Dao
interface CinemaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertallCinema(cinemaModels: List<CinemaModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCinema(cinemaModel: CinemaModel)

    @Query("SELECT * FROM cinematable")
    fun getallCinema(): LiveData<List<CinemaModel>>

    @Query("SELECT * FROM cinematable where ID_KC = :pid ")
    fun getCinema(pid: String?): LiveData<CinemaModel>
}