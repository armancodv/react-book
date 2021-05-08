package com.armanco.reactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,

        @ColumnInfo(name = "category_id", index = true)
        val categoryId: Long,

        @ColumnInfo(name = "order_num", index = true)
        val orderNum: Int,

        @ColumnInfo(name = "title")
        val title: String,

        @ColumnInfo(name = "description")
        val description: String
)