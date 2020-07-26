package com.beone.krisjayasejathtera.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.beone.krisjayasejathtera.data.local.CarouselDao
import com.beone.krisjayasejathtera.utils.DummyClass

class HomeViewModel(dummyClass: DummyClass, carouselDao: CarouselDao) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment : ${dummyClass.hashCode()} ${dummyClass.HelloWorld()} database instance : ${carouselDao.hashCode()}"
    }
    val text: LiveData<String> = _text
}