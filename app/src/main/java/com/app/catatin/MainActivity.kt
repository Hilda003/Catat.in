package com.app.catatin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.app.catatin.navigation.BottomNavigation
import com.loomi.catatin.ui.theme.CatatinV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatatinV2Theme {

            }
        }
    }
}

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
            .fillMaxSize(),
        bottomBar = { BottomNavigation(navController = navController) },

    ) {
        // Content of the main screen
        Text(
            text = "Welcome to Catatin",
            modifier = Modifier.padding(it)
        )
    }

}
