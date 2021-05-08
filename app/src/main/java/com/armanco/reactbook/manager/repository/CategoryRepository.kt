package com.armanco.reactbook.manager.repository

import com.armanco.reactbook.manager.db.CategoryDao
import com.armanco.reactbook.model.Category
import javax.inject.Inject

class CategoryRepository @Inject constructor(
        private val categoryDao: CategoryDao
){
    suspend fun getAll() = categoryDao.getAll()
    suspend fun insertAll(vararg category: Category) = categoryDao.insertAll(*category)
    suspend fun delete(category: Category) = categoryDao.delete(category)
    suspend fun deleteAll() = categoryDao.deleteAll()
    suspend fun getCount() = categoryDao.getCount()
}