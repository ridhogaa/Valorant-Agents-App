package com.ergea.valorantagentsapp.data

import com.ergea.valorantagentsapp.model.Agent
import com.ergea.valorantagentsapp.model.FakeAgentDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

class AgentRepository {

    private val dummyAgent = mutableListOf<Agent>()

    init {
        if (dummyAgent.isEmpty()) {
            dummyAgent.addAll(FakeAgentDataSource.dummyAgents)
        }
    }

    fun getAllAgentsWithFlow() = flowOf(dummyAgent)

    fun getAgentById(id: Long) = dummyAgent.first { it.id == id }

    fun getFavoriteAgent() = flowOf(dummyAgent.filter { it.isFavorite })

    fun updateAgent(id: Int, newState: Boolean): Flow<Boolean> {
        val index = dummyAgent.indexOfFirst { it.id.toInt() == id }
        val result = if (index >= 0) {
            val agent = dummyAgent[index]
            dummyAgent[index] = agent.copy(isFavorite = newState)
            true
        } else {
            false
        }
        return flowOf(result)
    }

    fun searchAgent(query: String) = flow {
        val data = dummyAgent.filter {
            it.name.contains(query, ignoreCase = true)
        }
        emit(data)
    }

    companion object {
        @Volatile
        private var instance: AgentRepository? = null

        fun getInstance(): AgentRepository =
            instance ?: synchronized(this) {
                AgentRepository().apply {
                    instance = this
                }
            }
    }
}