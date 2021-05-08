package com.armanco.reactbook.manager.db

import androidx.room.*
import com.armanco.reactbook.model.Article

@Dao
interface ArticleDao {
    @Query("SELECT * FROM article ORDER BY order_num ASC")
    suspend fun getAll(): List<Article>

    @Query("SELECT * FROM article WHERE category_id = :categoryId ORDER BY order_num ASC")
    suspend fun getByCategory(categoryId: Long): List<Article>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg article: Article)

    @Delete
    suspend fun delete(article: Article)

    @Query("DELETE FROM article")
    suspend fun deleteAll()

    @Query("SELECT COUNT(id) FROM article")
    suspend fun getCount(): Int
}
