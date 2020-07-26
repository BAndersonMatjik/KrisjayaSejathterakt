package com.beone.krisjayasejathtera.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.beone.krisjayasejathtera.base.BaseApplication
import com.beone.krisjayasejathtera.data.local.KrisjayaDatabase
import com.beone.krisjayasejathtera.data.local.LiveDataTestUtil
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.hamcrest.CoreMatchers.`is` as Is

@RunWith(AndroidJUnit4::class)
class KrisjayaDatabaseTest {

    private lateinit var krisjayaDatabase: KrisjayaDatabase

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        krisjayaDatabase = Room.inMemoryDatabaseBuilder(
            InstrumentationRegistry.getInstrumentation().context,
            KrisjayaDatabase::class.java
        ).allowMainThreadQueries().build()
    }

    @After
    fun tearDown() {
        krisjayaDatabase.close()
    }

    @Test
    fun testIfEmptyAuditorium(){
        val liveData = krisjayaDatabase.auditoriumDao().getallauditorium()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptyCarousel(){
        val liveData = krisjayaDatabase.carouselDao().getAllCarosel()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptyCategory(){
        val liveData = krisjayaDatabase.categoryDao().getallsCategory()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptyCinema(){
        val liveData = krisjayaDatabase.cinemaDao().getallCinema()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptyMejaSekolah(){
        val liveData = krisjayaDatabase.mejaSekolahDao().getallMejaSekolah()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptyNewArrival(){
        val liveData = krisjayaDatabase.newArrivalDao().getAllNewArrival()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }

    @Test
    fun testIfEmptySofa(){
        val liveData = krisjayaDatabase.sofaDao().getAllSofa()
        val items =
            LiveDataTestUtil.getValue(
                liveData
            )
        assertThat(items.size,Is(0))
    }




}