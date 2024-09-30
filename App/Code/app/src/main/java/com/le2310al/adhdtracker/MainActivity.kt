package com.le2310al.adhdtracker

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.le2310al.adhdtracker.ui.theme.AdhdTrackerTheme
import kotlinx.serialization.Serializable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
//import com.le2310al.adhdtracker.di.AppDatabase
//import com.le2310al.adhdtracker.di.UserDao
import com.le2310al.adhdtracker.ui.DiaryScreen
import com.le2310al.adhdtracker.ui.GraphScreen
import com.le2310al.adhdtracker.ui.HomeScreen
import com.le2310al.adhdtracker.ui.SettingsScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

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

/*
@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun providesAtDatabase(
        @ApplicationContext context: Context,
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "at-database",
    ).build()
}

@Module
@InstallIn(SingletonComponent::class)
internal object DaosModule {
    @Provides
    fun providesUserDao(
        database: AppDatabase,
    ): UserDao = database.userDao()
}

 */