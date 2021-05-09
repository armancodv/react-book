package com.armanco.reactbook.navigation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.armanco.reactbook.manager.repository.ArticleRepository
import com.armanco.reactbook.manager.repository.CategoryRepository
import com.armanco.reactbook.manager.repository.ElementRepository
import com.armanco.reactbook.model.Category
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val categoryRepository: CategoryRepository,
    private val articleRepository: ArticleRepository,
    private val elementRepository: ElementRepository,
): ViewModel() {
    val categories = MutableLiveData<List<Category>>()

    fun load() {
        viewModelScope.launch {
            categoryRepository.deleteAll()
            categoryRepository.populate()
            articleRepository.deleteAll()
            articleRepository.populate()
            elementRepository.deleteAll()
            elementRepository.populate()
            categories.postValue(categoryRepository.getAll())
        }
    }
}