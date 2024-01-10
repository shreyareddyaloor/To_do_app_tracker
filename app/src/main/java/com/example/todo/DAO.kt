package com.example.todo
import androidx.room.Insert
import androidx.room.*
import androidx.room.Update
import java.util.*
@Dao
interface DAO {
    @Insert
    fun insertTask(entity: Entity)

    @Update
    fun updateTask(entity: Entity)

    @Delete
    fun deleteTask(entity: Entity)

    @Query("Delete from to_do")
    fun deleteAll()

    @Query("Select * from to_do")
    fun getTasks():List<Entity>
    @Query("SELECT * FROM to_do WHERE dueDate >= :currentDate")
    fun getTasksWithDueDate(currentDate: Date): List<Entity>

}