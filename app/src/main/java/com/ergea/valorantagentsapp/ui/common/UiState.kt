package com.ergea.valorantagentsapp.ui.common

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

sealed class UiState<out T : Any?> {
    object Loading : UiState<Nothing>()

    data class Success<out T : Any>(val data: T) : UiState<T>()

    data class Error(val errorMessage: String) : UiState<Nothing>()
}