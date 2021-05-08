package com.armanco.reactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.armanco.reactbook.manager.db.ElementTypeConverters

@Entity
data class Element(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,

        @ColumnInfo(name = "article_id", index = true)
        val articleId: Long,

        @ColumnInfo(name = "order_num", index = true)
        val orderNum: Int,

        @ColumnInfo(name = "text")
        val text: String,

        @ColumnInfo(name = "url")
        val url: String,

        @ColumnInfo(name = "element_type")
        @TypeConverters(ElementTypeConverters::class)
        val elementType: ElementType,
)