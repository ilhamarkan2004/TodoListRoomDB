package com.example.roomdb.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo (
    @PrimaryKey(autoGenerate = true) var id : Int,
    var task : String
)