package com.armanco.reactbook.model

import androidx.room.Embedded
import androidx.room.Relation

data class ArticleWithElements(

        @Embedded
        val article: Article,

        @Relation(parentColumn = "id", entityColumn = "article_id")
        val elements: List<Element>

)