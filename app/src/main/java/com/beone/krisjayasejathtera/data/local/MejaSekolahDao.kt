package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.MejaSekolahModel

@Dao
interface MejaSekolahDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertallMejaSekolah(mejaSekolahModels: List<MejaSekolahModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMejaSekolah(mejaSekolahModel: MejaSekolahModel)

    @Query("SELECT * FROM MejaSekolahTable")
    fun getallMejaSekolah(): LiveData<List<MejaSekolahModel>>

    @Query("SELECT * FROM MejaSekolahTable WHERE ID_MS =:id")
    fun getMejaSekolah(id: String?): LiveData<MejaSekolahModel>
}