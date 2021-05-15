package com.armanco.reactbook.view.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.armanco.reactbook.R
import com.armanco.reactbook.model.Category
import kotlinx.android.synthetic.main.view_category.view.*


class CategoryView(context: Context, attrs: AttributeSet): ConstraintLayout(context, attrs) {

    var onCardClick: ((Category)->Unit)? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_category, this, true)
    }

    fun with(category: Category) {
        titleTv?.text = category.title
    }
}