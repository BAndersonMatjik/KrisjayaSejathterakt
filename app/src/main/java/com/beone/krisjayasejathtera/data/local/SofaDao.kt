package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.SofaModel

@Dao
interface SofaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertAllSofa(newArrivalModels: List<SofaModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSofa(newArrivalModel: SofaModel)

    @Query("SELECT * FROM SofaTable")
    fun getAllSofa(): LiveData<List<SofaModel>>

    @Query("SELECT * FROM SofaTable Where ID_KS = :pid")
    fun getSofa(pid: String?): LiveData<SofaModel>
}