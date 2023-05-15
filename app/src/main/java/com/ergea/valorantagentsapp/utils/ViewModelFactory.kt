package com.ergea.valorantagentsapp.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ergea.valorantagentsapp.data.AgentRepository
import com.ergea.valorantagentsapp.ui.screen.detail.DetailViewModel
import com.ergea.valorantagentsapp.ui.screen.favorite.FavoriteViewModel
import com.ergea.valorantagentsapp.ui.screen.home.HomeViewModel

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

class ViewModelFactory(private val repository: AgentRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(FavoriteViewModel::class.java)) {
            return FavoriteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}