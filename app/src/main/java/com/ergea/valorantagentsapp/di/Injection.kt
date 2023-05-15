package com.ergea.valorantagentsapp.di

import com.ergea.valorantagentsapp.data.AgentRepository

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

object Injection {
    fun provideRepository(): AgentRepository {
        return AgentRepository.getInstance()
    }
}