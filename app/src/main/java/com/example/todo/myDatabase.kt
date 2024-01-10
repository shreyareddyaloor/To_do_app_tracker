package com.example.todo

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
@Database(entities = [Entity::class],version=1)
@TypeConverters(DateConverter::class)
abstract class myDatabase : RoomDatabase() {
    abstract fun dao():DAO
}