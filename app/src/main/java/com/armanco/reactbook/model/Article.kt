package com.armanco.reactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(
        @PrimaryKey
        val id: Long,

        @ColumnInfo(name = "category_id", index = true)
        val categoryId: Long,

        @ColumnInfo(name = "title")
        val title: String? = null,

        @ColumnInfo(name = "description")
        val description: String? = null
)