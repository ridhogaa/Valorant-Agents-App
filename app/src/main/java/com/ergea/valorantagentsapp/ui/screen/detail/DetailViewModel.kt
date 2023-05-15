package com.ergea.valorantagentsapp.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ergea.valorantagentsapp.data.AgentRepository
import com.ergea.valorantagentsapp.model.Agent
import com.ergea.valorantagentsapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

class DetailViewModel(
    private val repository: AgentRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<Agent>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Agent>>
        get() = _uiState

    fun getAgentById(id: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getAgentById(id))
        }
    }

    fun updateAgent(id: Int, newState: Boolean) = viewModelScope.launch {
        repository.updateAgent(id, !newState)
            .collect { isUpdated ->
                if (isUpdated) getAgentById(id.toLong())
            }
    }
}