package com.armanco.reactbook.manager.db.populate.react

import com.armanco.reactbook.model.Category

object PopulateReactCategory {
    const val id: Long = 1
    const val title = "React"
    val category = Category(id = id, title = title)
}