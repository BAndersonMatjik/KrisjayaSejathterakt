package com.beone.krisjayasejathtera.koin

import androidx.room.Room
import com.beone.krisjayasejathtera.data.local.KrisjayaDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val persistanceModule = module {
    single {
        Room.databaseBuilder(androidApplication(), KrisjayaDatabase::class.java, "Database.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    single {
        get<KrisjayaDatabase>().auditoriumDao()
    }

    single {
        get<KrisjayaDatabase>().carouselDao()
    }

    single {
        get<KrisjayaDatabase>().categoryDao()
    }

    single {
        get<KrisjayaDatabase>().cinemaDao()
    }

    single {
        get<KrisjayaDatabase>().mejaSekolahDao()
    }

    single {
        get<KrisjayaDatabase>().newArrivalDao()
    }

    single {
        get<KrisjayaDatabase>().sofaDao()
    }

}