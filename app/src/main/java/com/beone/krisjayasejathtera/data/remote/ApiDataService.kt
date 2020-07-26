package com.beone.krisjayasejathtera.data.remote

import com.beone.krisjayasejathtera.data.model.*
import io.reactivex.Observable
import io.reactivex.Observer
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface ApiDataService {

    @GET("get_kategori")
    fun getAllKategory():Observable<List<CategoryModel>>

    @GET("get_carousel")
    fun getAllCarouselAll(): Observable<List<CaroselModel>>

    @GET("get_newarrival")
    fun getNewArrival(): Observable<List<NewArrivalModel>>

    @GET("get_detail_mejasekolah")
    fun getDetailMejaSekolah(@Query("pid") pid:String): Observable<MejaSekolahModel>

    @GET("get_detail_sofa")
    fun getDetailSofa(@Query("pid")pid:String ): Observable<SofaModel>

    @GET("get_detail_cinema")
    fun getDetailCinema(@Query("pid") pid:String ):Observable<CinemaModel>

    @GET("get_detail_auditorium")
    fun getDetailAuditorium(@Query("pid") pid: String):Observable<AuditoriumModel>
}