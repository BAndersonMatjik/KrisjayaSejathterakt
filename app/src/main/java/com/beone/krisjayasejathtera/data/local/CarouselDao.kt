package com.beone.krisjayasejathtera.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.beone.krisjayasejathtera.data.model.CaroselModel

@Dao
interface CarouselDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCarousel(caroselModel: CaroselModel?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCarouselAll(caroselModels: List<CaroselModel>)

    @Query("SELECT * FROM CarouselTable")
    fun getAllCarosel(): LiveData<List<CaroselModel>>
}