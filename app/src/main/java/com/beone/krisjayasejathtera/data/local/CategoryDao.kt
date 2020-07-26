package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.CategoryModel

@Dao
interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertallCategory(categoryEntities: List<CategoryModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(categoryEntities: CategoryModel)

    @Query("SELECT * FROM CategoryEntity")
    fun getallsCategory(): LiveData<List<CategoryModel>>

    @Query("SELECT * FROM CategoryEntity WHERE ID_Kategori =:id")
    fun getCategory(id: Int): LiveData<CategoryModel>

    @Query("UPDATE CategoryEntity SET Nama_Kategori =:namacategory where ID_Kategori =:id")
    fun updateCategory(id: String?, namacategory: String?)

}