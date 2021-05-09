package com.armanco.reactbook.navigation.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.armanco.reactbook.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*

@AndroidEntryPoint
class HomeFragment: Fragment(R.layout.fragment_home) {
    private val model: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.load()
        model.categories.observe(viewLifecycleOwner) { categories ->
            Log.d("HomeFragment", "categories")
            categoryListView?.with(categories)
        }
    }
}