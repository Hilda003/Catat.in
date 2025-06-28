package com.app.catatin.ui

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Budget : Screen("budget")
    object Report : Screen("report")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object About : Screen("about")
    object Help : Screen("help")
    object Notifications : Screen("notifications")
    object Transactions : Screen("transactions")
    object Categories : Screen("categories")
}