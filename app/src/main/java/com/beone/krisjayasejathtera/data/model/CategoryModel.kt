package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CategoryEntity")
data class CategoryModel(
    @PrimaryKey
    @NonNull
    val ID_Kategori: String,
    val Nama_Kategori: String,
    val img: String
)