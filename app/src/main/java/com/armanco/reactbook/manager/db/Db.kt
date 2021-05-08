package com.armanco.reactbook.manager.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.armanco.reactbook.model.Article
import com.armanco.reactbook.model.Category
import com.armanco.reactbook.model.Element

@Database(entities = [
    Article::class,
    Category::class,
    Element::class
], version = 1)
abstract class Db : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
    abstract fun categoryDao(): CategoryDao
    abstract fun elementDao(): ElementDao
}