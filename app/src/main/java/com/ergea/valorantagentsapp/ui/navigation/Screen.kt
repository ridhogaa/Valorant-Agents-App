package com.ergea.valorantagentsapp.ui.navigation

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

sealed class Screen(val route: String) {
    object Home : Screen("home")

    object Detail : Screen("home/{id}") {
        fun createRoute(id: Long) = "home/$id"
    }

    object Favorite : Screen("favorite")

    object AboutUs : Screen("about")
}