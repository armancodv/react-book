package com.armanco.reactbook.view.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.armanco.reactbook.R
import com.armanco.reactbook.model.Category
import com.armanco.reactbook.view.adapter.CategoryAdapter
import kotlinx.android.synthetic.main.view_category_list.view.*


class CategoryListView(context: Context, attrs: AttributeSet): ConstraintLayout(context, attrs) {

    var onCardClick: ((Category)->Unit)? = null
    private var adapter = CategoryAdapter()
    private var layoutManager =  LinearLayoutManager(context)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_category_list, this, true)
        rvCategory?.let {
            it.adapter = adapter
            it.layoutManager = layoutManager
        }
    }

    fun with(categories: List<Category>) {
        adapter.onCardClick = onCardClick
        adapter.data = categories
    }
}