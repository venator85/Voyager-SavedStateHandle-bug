package com.savedstatehandlebug

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val key = "errorState"

    val errorState: StateFlow<Boolean> = savedStateHandle.getStateFlow(key, false)

    fun login() {
        savedStateHandle[key] = true
    }

}
