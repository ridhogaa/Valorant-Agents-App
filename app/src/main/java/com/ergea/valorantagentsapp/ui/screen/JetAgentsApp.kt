package com.ergea.valorantagentsapp.ui.screen

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ergea.valorantagentsapp.R
import com.ergea.valorantagentsapp.ui.navigation.NavigationItem
import com.ergea.valorantagentsapp.ui.navigation.Screen
import com.ergea.valorantagentsapp.ui.screen.about.AboutUsScreen
import com.ergea.valorantagentsapp.ui.screen.detail.DetailScreen
import com.ergea.valorantagentsapp.ui.screen.favorite.FavoriteScreen
import com.ergea.valorantagentsapp.ui.screen.home.HomeScreen
import com.ergea.valorantagentsapp.ui.theme.ValorantAgentsAppTheme

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

@Composable
fun JetAgentsApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.Detail.route) {
                BottomBar(navHostController = navHostController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navigateToDetail = { id ->
                    navHostController.navigate(Screen.Detail.createRoute(id))
                })
            }
            composable(Screen.Favorite.route) {
                FavoriteScreen(navigateToDetail = { id ->
                    navHostController.navigate(Screen.Detail.createRoute(id))
                })
            }
            composable(Screen.AboutUs.route) {
                AboutUsScreen()
            }
            composable(
                route = Screen.Detail.route,
                arguments = listOf(navArgument("id") { type = NavType.LongType }),
            ) {
                val id = it.arguments?.getLong("id") ?: -1L
                DetailScreen(
                    id,
                    navigateBack = {
                        navHostController.navigateUp()
                    },
                )
            }

        }
    }
}

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    BottomNavigation(
        modifier = modifier
    ) {
        val navBackStackEntry by navHostController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.favorite),
                icon = Icons.Default.Favorite,
                screen = Screen.Favorite
            ),
            NavigationItem(
                title = stringResource(id = R.string.about_page),
                icon = Icons.Default.AccountCircle,
                screen = Screen.AboutUs
            )
        )
        BottomNavigation {
            navigationItems.map { navigationItem ->
                AddItem(
                    navigationItem = navigationItem,
                    currentRoute = currentRoute,
                    navHostController = navHostController
                )
            }
        }
    }
}

@Composable
private fun RowScope.AddItem(
    modifier: Modifier = Modifier,
    navigationItem: NavigationItem,
    currentRoute: NavDestination?,
    navHostController: NavHostController
) {
    BottomNavigationItem(
        modifier = modifier,
        icon = {
            Icon(
                imageVector = navigationItem.icon,
                contentDescription = if (navigationItem.title.equals(
                        "About",
                        false
                    )
                ) "about_page" else navigationItem.title
            )
        },
        label = {
            Text(
                text = navigationItem.title
            )
        },
        selected = currentRoute?.hierarchy?.any { navDestination ->
            navDestination.route == navigationItem.screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navHostController.navigate(route = navigationItem.screen.route) {
                popUpTo(id = navHostController.graph.findStartDestination().id) {
                    saveState = true
                }
                restoreState = true
                launchSingleTop = true
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun JetAgentsAppPreview() {
    ValorantAgentsAppTheme {
        JetAgentsApp()
    }
}