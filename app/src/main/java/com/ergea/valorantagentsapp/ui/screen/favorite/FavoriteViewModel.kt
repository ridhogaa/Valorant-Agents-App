package com.ergea.valorantagentsapp.ui.screen.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ergea.valorantagentsapp.data.AgentRepository
import com.ergea.valorantagentsapp.model.Agent
import com.ergea.valorantagentsapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

class FavoriteViewModel(
    private val repository: AgentRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<Agent>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Agent>>>
        get() = _uiState

    fun getFavoriteAgent() {
        viewModelScope.launch {
            repository.getFavoriteAgent()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { data ->
                    _uiState.value = UiState.Success(data)
                }
        }
    }
}