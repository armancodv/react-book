package com.armanco.reactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,

        @ColumnInfo(name = "order_num", index = true)
        val orderNum: Int,

        @ColumnInfo(name = "title")
        val title: String,

        @ColumnInfo(name = "description")
        val description: String
)