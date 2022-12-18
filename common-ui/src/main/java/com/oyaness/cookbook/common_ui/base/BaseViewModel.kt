package com.oyaness.cookbook.common_ui.base

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
//import dagger.hilt.android.lifecycle.HiltViewModel

/**
 * @author Oya
 * @date 01.1.2022
 */
//@HiltViewModel
abstract class BaseViewModel(protected val savedStateHandle: SavedStateHandle) : ViewModel() {
//    private val disposables = CompositeDisposable()

    /**
     * Dispose from current [CompositeDisposable].
     */
    override fun onCleared() {
//        disposables.dispose()
        super.onCleared()
    }

    /**
     * Dispose from current [CompositeDisposable].
     */
//    protected fun addDisposable(disposable: Disposable) {
//        disposables.add(disposable)
//    }

}