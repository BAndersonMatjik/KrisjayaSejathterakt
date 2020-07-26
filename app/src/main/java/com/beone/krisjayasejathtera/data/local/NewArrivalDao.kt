package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.NewArrivalModel

@Dao
interface NewArrivalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllNewArrival(newArrivalModels: List<NewArrivalModel?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewArrival(newArrivalModel: NewArrivalModel?)

    @Query("SELECT * FROM NewArrivalTable")
    fun getAllNewArrival(): LiveData<List<NewArrivalModel>>

    @Query("SELECT * FROM NewArrivalTable Where namaproduct = :namaproduct")
    fun getNewArrival(namaproduct: String): LiveData<NewArrivalModel>
}