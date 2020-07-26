package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.AuditoriumModel

@Dao
interface AuditoriumDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertallAuditorium(auditoriumModels: List<AuditoriumModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAuditorium(auditoriumModel: AuditoriumModel)

    @Query("SELECT * FROM auditoriumtable")
    fun getallauditorium(): LiveData<List<AuditoriumModel>>

    @Query("SELECT * FROM auditoriumtable where ID_KADT = :pid ")
    fun getAuditorium(pid: String?): LiveData<AuditoriumModel>

}