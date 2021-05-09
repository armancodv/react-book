package com.armanco.reactbook.manager.db.populate.react

import com.armanco.reactbook.model.Article
import com.armanco.reactbook.model.Element
import com.armanco.reactbook.model.ElementType

object PopulateReactArticle1 {
    const val id: Long = 1
    const val title = "Test"
    val article = Article(id = id, categoryId = PopulateReactCategory.id, title = title)

    val elements = listOf(
            Element(orderNum = 1, text = "Sample", elementType = ElementType.HTML, articleId = id)
    )
}