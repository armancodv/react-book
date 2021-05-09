package com.armanco.reactbook.navigation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.armanco.reactbook.manager.repository.CategoryRepository
import com.armanco.reactbook.model.Category
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: CategoryRepository,
): ViewModel() {
    val categories = MutableLiveData<List<Category>>()

    fun load() {
        viewModelScope.launch {
            categories.postValue(repository.getAll())
        }
    }
}