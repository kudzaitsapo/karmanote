package com.kudzaitsapo.karmanote.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "deeds")
data class DeedEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "person_id")
    val personId: Int,

    @ColumnInfo(name = "description")
    val description: String
)
