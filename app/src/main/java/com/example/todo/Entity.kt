package com.example.todo

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity(tableName = "To_Do")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String,
    var dueDate: Date?
)