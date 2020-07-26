package com.beone.krisjayasejathtera.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beone.krisjayasejathtera.data.model.*

@Database(
    entities = arrayOf(
        AuditoriumModel::class,
        CaroselModel::class,
        CategoryModel::class,
        CinemaModel::class,
        MejaSekolahModel::class,
        NewArrivalModel::class,
        SofaModel::class
    ),
    version = 1,
    exportSchema = false
)
public abstract class KrisjayaDatabase: RoomDatabase() {
    abstract fun auditoriumDao(): AuditoriumDao
    abstract fun carouselDao(): CarouselDao
    abstract fun categoryDao(): CategoryDao
    abstract fun cinemaDao(): CinemaDao
    abstract fun mejaSekolahDao(): MejaSekolahDao
    abstract fun newArrivalDao(): NewArrivalDao
    abstract fun sofaDao(): SofaDao
}