package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "auditoriumtable")
data class AuditoriumModel(
    val Cover: String,
    val Dudukan: String,
    val Foam_DS: String,
    @PrimaryKey
    @NonNull
    val ID_KADT: String,
    val ID_Kategori: String,
    val Img1: String,
    val Img2: String,
    val Img3: String,
    val Kdlm_Dudukan: String,
    val KopLuar_DS: String,
    val L_Dudukan: String,
    val L_Keseluruhan: String,
    val L_Tangan: String,
    val Mj_Tulis: String,
    val Obj: String,
    val P_Keseluruhan: String,
    val P_Tangan: String,
    val Rk_Kaki: String,
    val Rk_Konstruksi: String,
    val Sandaran: String,
    val Sdr_Tangan: String,
    val St_Dudukan: String,
    val T_Dudukan: String,
    val T_Keseluruhan: String,
    val T_Sandaran: String,
    val namaproduk: String
)