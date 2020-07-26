package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MejaSekolahTable")
data class MejaSekolahModel(
    val Finishing: String,
    val ID_Kategori: String,
    @PrimaryKey
    @NonNull
    val ID_MS: String,
    val Img1: String,
    val Img2: String,
    val Img3: String,
    val Laci: String,
    val Obj: String,
    val Penutup: String,
    val Rangka: String,
    val Tinggi: String,
    val Top_Table: String,
    val kdudukan: String,
    val kfinishing: String,
    val krangka: String,
    val ksandaran: String,
    val namaproduk: String,
    val ttinggiSandaran: String
)