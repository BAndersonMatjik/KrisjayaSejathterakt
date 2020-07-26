package com.beone.krisjayasejathtera.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NewArrivalTable")
data class NewArrivalModel(
    val createdate: String,
    val id: String,
    val image: String,
    val kid: String,
    val namaproduct: String,
    @PrimaryKey
    @NonNull
    val pid: String
)