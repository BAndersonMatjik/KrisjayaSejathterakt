package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CarouselTable")
data class CaroselModel(
    @PrimaryKey
    @NonNull
    val idcarousel: String,
    val image: String
)