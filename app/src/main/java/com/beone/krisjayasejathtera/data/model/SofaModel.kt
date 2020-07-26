package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SofaTable")
data class SofaModel(
    val Dudukan: String,
    @PrimaryKey
    @NonNull
    val ID_KS: String,
    val ID_Kategori: String,
    val Img1: String,
    val Img2: String,
    val Img3: String,
    val L_Dudukan: String,
    val L_Sofa: String,
    val L_Tangan: String,
    val Obj: String,
    val Panel: String,
    val Sandaran: String,
    val TL_Kursi: String,
    val T_Dudukan: String,
    val T_Sandaran: String,
    val namaproduk: String
)