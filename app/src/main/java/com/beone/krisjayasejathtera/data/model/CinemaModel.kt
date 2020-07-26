package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CinemaTable")
data class CinemaModel(
    val Cover: String,
    val Dudukan: String,
    @PrimaryKey
    @NonNull
    val ID_KC: String,
    val ID_Kategori: String,
    val Img1: String,
    val Img2: String,
    val Img3: String,
    val K_Keseluruhan: String,
    val Kdlm_Dudukan: String,
    val L_Dudukan: String,
    val L_Tangan: String,
    val Obj: String,
    val P_Keseluruhan: String,
    val P_Tangan: String,
    val Rk_Kaki: String,
    val Sandaran: String,
    val Sdr_Tangan: String,
    val St_Dudukan: String,
    val T_Dudukan: String,
    val T_Sandaran: String,
    val Tp_Gelas: String,
    val namaproduk: String
)