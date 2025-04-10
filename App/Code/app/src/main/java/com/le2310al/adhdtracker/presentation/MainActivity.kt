package com.le2310al.adhdtracker.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.le2310al.adhdtracker.presentation.diary.DiaryScreen
import com.le2310al.adhdtracker.presentation.graph.GraphScreen
import com.le2310al.adhdtracker.presentation.home.HomeScreen
import com.le2310al.adhdtracker.presentation.settings.SettingsScreen
import com.le2310al.adhdtracker.presentation.ui.theme.AdhdTrackerTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val vm: MainViewModel by viewModels()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdhdTrackerTheme {
                val navController = rememberNavController()
                val uiState by vm.uiState.collectAsStateWithLifecycle()
                NavHost(
                    navController = navController,
                    startDestination = Home(null)
                ){
                    composable<Home> {
                        HomeScreen(navController, vm, uiState)
                    }

                    composable<Graph> {
                        GraphScreen(navController, vm)
                    }
                    composable<Diary> {
                        DiaryScreen(navController,vm, uiState)
                    }
                    composable<Settings> {
                        SettingsScreen(navController,vm)
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