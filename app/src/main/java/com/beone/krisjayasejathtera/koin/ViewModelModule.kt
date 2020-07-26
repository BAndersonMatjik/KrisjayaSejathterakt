package com.beone.krisjayasejathtera.koin

import com.beone.krisjayasejathtera.ui.home.HomeViewModel
import com.beone.krisjayasejathtera.utils.DummyClass
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { HomeViewModel(get(),get()) }
}

val DummyModule = module {
    fun HelloWorld() = DummyClass()

    factory {
      HelloWorld()
    }
}