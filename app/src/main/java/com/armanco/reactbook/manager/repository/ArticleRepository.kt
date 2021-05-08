package com.armanco.reactbook.manager.repository

import com.armanco.reactbook.manager.db.ArticleDao
import com.armanco.reactbook.model.Article
import javax.inject.Inject

class ArticleRepository @Inject constructor(
        private val articleDao: ArticleDao
){
    suspend fun getAll() = articleDao.getAll()
    suspend fun getByCategory(categoryId: Long) = articleDao.getByCategory(categoryId)
    suspend fun insertAll(vararg article: Article) = articleDao.insertAll(*article)
    suspend fun delete(article: Article) = articleDao.delete(article)
    suspend fun deleteAll() = articleDao.deleteAll()
    suspend fun getCount() = articleDao.getCount()
}