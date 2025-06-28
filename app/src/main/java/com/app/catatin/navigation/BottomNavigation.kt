package com.app.catatin.navigation


import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.app.catatin.R


@Composable
fun BottomNavigation(
    navController: NavController
) {
    val navigationItem = listOf(
        NavigationItem(
            title = "Home",
            icon = painterResource(id = R.drawable.ic_home_unselected),
            route = "home"
        ),
        NavigationItem(
            title = "Budget",
            icon = painterResource(id = R.drawable.ic_home_unselected),
            route = "budget"
        ),
        NavigationItem(
            title = "Report",
            icon = painterResource(id = R.drawable.ic_report_unselected),
            route = "transaction"
        ),
        NavigationItem(
            title = "Profile",
            icon = painterResource(id = R.drawable.ic_person_unselected),
            route = "profile"
        )
    )

    NavigationBar {
        navigationItem.forEach { item ->
            NavigationBarItem(
                icon = { Icon(painter = item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = navController.currentDestination?.route == item.route,
                onClick = { navController.navigate(item.route) },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = colorResource(R.color.blue),
                    selectedTextColor = colorResource(R.color.blue),
                    unselectedIconColor = colorResource(R.color.grey),
                    unselectedTextColor = colorResource(R.color.grey),
                )
            )

        }
    }

}


data class NavigationItem(
    val title: String,
    val icon: Painter,
    val route: String,
)

@Composable
@Preview
fun BottomNavigationPreview() {
    BottomNavigation(navController = NavController(
        context = androidx.compose.ui.platform.LocalContext.current.applicationContext
    ))
}