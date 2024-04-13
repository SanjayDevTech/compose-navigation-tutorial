package com.example.androidxcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidxcomposenavigation.ui.theme.AndroidXComposeNavigationTheme
import com.example.screens.FirstScreen
import com.example.screens.SecondScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidXComposeNavigationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        FirstScreen {
                            navController.navigate("second")
                        }
                    }
                    composable("second") {
                        SecondScreen()
                    }
                }
            }
        }
    }
}
