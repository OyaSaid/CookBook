//package com.oyaness.cookbook.recipes.categories
//
//import androidx.lifecycle.SavedStateHandle
//import com.oyaness.cookbook.common_ui.base.BaseViewModel
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//
///**
// * @author Oya
// * @date 17.1.2022
// */
//
//class CategoriesViewModel(savedStateHandle: SavedStateHandle) : BaseViewModel(savedStateHandle) {
//    private val _uiState = MutableStateFlow(CategoryViewState())
//    val uiState: StateFlow<CategoryViewState> = _uiState
//}