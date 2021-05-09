package com.armanco.reactbook.manager.db

import androidx.room.*
import com.armanco.reactbook.model.Category

@Dao
interface CategoryDao {
    @Query("SELECT * FROM category")
    suspend fun getAll(): List<Category>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg category: Category)

    @Delete
    suspend fun delete(category: Category)

    @Query("DELETE FROM category")
    suspend fun deleteAll()

    @Query("SELECT COUNT(id) FROM category")
    suspend fun getCount(): Int
}
