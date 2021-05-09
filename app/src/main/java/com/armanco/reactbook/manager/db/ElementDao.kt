package com.armanco.reactbook.manager.db

import androidx.room.*
import com.armanco.reactbook.model.Element

@Dao
interface ElementDao {
    @Query("SELECT * FROM element")
    suspend fun getAll(): List<Element>

    @Query("SELECT * FROM element WHERE article_id = :articleId")
    suspend fun getByArticle(articleId: Long): List<Element>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg element: Element)

    @Delete
    suspend fun delete(element: Element)

    @Query("DELETE FROM element")
    suspend fun deleteAll()

    @Query("SELECT COUNT(id) FROM element")
    suspend fun getCount(): Int
}
