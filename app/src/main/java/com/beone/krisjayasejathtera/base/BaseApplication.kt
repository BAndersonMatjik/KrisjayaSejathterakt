package com.beone.krisjayasejathtera.base

import android.app.Application
import com.beone.krisjayasejathtera.koin.DummyModule
import com.beone.krisjayasejathtera.koin.NetworkModule
import com.beone.krisjayasejathtera.koin.ViewModelModule
import com.beone.krisjayasejathtera.koin.persistanceModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.Koin
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application(){


    override fun onCreate() {
        super.onCreate()
        //start koin
        startKoin {
            //logger
            androidLogger(Level.DEBUG)
            //android Context
            androidContext(this@BaseApplication)
            //Load properties file from Assets
            androidFileProperties()
            //modules
            modules(
                listOf(
                    NetworkModule,
                    DummyModule,
                    ViewModelModule,
                    persistanceModule
                )
            )
        }
    }
}