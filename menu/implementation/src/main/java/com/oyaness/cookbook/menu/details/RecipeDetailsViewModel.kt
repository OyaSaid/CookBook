//package com.oyaness.cookbook.recipes.details
//
//import androidx.lifecycle.SavedStateHandle
//import com.oyaness.cookbook.common_ui.base.BaseViewModel
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//
///**
// * @author Oya
// * @date 18.1.2022
// */
//class RecipeDetailsViewModel(savedStateHandle: SavedStateHandle) : BaseViewModel(savedStateHandle) {
//
//    private val _uiState = MutableStateFlow(RecipeDetailsViewState())
//    val uiState: StateFlow<RecipeDetailsViewState> = _uiState
//}