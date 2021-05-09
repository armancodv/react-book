package com.armanco.reactbook.manager.repository

import com.armanco.reactbook.manager.db.ElementDao
import com.armanco.reactbook.manager.db.populate.react.PopulateReactArticle1
import com.armanco.reactbook.model.Element
import javax.inject.Inject

class ElementRepository @Inject constructor(
        private val elementDao: ElementDao
){
    suspend fun getAll() = elementDao.getAll()
    suspend fun getByArticle(articleId: Long) = elementDao.getByArticle(articleId)
    suspend fun insertAll(vararg element: Element) = elementDao.insertAll(*element)
    suspend fun delete(element: Element) = elementDao.delete(element)
    suspend fun deleteAll() = elementDao.deleteAll()
    suspend fun getCount() = elementDao.getCount()
    suspend fun populate() {
        insertAll(
                *PopulateReactArticle1.elements.toTypedArray()
        )
    }
}