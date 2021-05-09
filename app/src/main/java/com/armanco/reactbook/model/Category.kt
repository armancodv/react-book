package com.armanco.reactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
        @PrimaryKey
        val id: Long,

        @ColumnInfo(name = "title")
        val title: String? = null,

        @ColumnInfo(name = "description")
        val description: String? = null
)