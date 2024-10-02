package com.le2310al.adhdtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.le2310al.adhdtracker.ui.screen.DiaryScreen
import com.le2310al.adhdtracker.ui.screen.GraphScreen
import com.le2310al.adhdtracker.ui.screen.HomeScreen
import com.le2310al.adhdtracker.ui.screen.SettingsScreen
import com.le2310al.adhdtracker.ui.theme.AdhdTrackerTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdhdTrackerTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Home(null)
                ){
                    composable<Home> {
                        HomeScreen(navController)
                    }
                    composable<Graph> {
                        GraphScreen(navController)
                    }
                    composable<Diary> {
                        DiaryScreen(navController)
                    }
                    composable<Settings> {
                        SettingsScreen(navController)
                    }
                }
            }
        }
    }
}

@Serializable
data class Home(
    val date: String?
)

@Serializable
data class Graph(
    val date: String?
)

@Serializable
data class Diary(
    val date: String?
)

@Serializable
object Settings