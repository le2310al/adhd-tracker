package com.le2310al.adhdtracker

import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.le2310al.adhdtracker.ui.theme.AdhdTrackerTheme
import kotlinx.serialization.Serializable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.le2310al.adhdtracker.EntryModule.provideEntryDatabase
import com.le2310al.adhdtracker.ui.DiaryScreen
import com.le2310al.adhdtracker.ui.GraphScreen
import com.le2310al.adhdtracker.ui.HomeScreen
import com.le2310al.adhdtracker.ui.SettingsScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Inject
import jakarta.inject.Singleton

@HiltAndroidApp
class AdhdTracker : Application()

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    /*
    // needs dagger-hilt
    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            EntryDatabase::class.java,
            "entries.db"
        ).build()
    }
    private val viewModel by viewModels<EntryViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return EntryViewModel(db.entryDao) as T
                }
            }
        }
    )
     */
    //private val db = provideEntryDatabase(applicationContext)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdhdTrackerTheme {
                val viewModel: EntryViewModel by viewModels()
                val state by viewModel.state.collectAsState()
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
                        DiaryScreen(state, viewModel, navController)
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

@Module

@InstallIn(SingletonComponent::class)
object EntryModule {
    @Provides
    @Singleton
    fun provideEntryDatabase(@ApplicationContext appContext: Context): EntryDatabase {
        return Room.databaseBuilder(
            appContext,
            EntryDatabase::class.java,
            "entries.db"
        ).build()
    }
    @Provides
    @Singleton
    fun provideEntryDao(entryDatabase: EntryDatabase) : EntryDao{
        return entryDatabase.entryDao()
    }
    @Provides
    @Singleton
    fun provideEntryRepository(entryDao: EntryDao): EntryRepository {
        return EntryRepository(entryDao)
    }
}

class EntryRepository @Inject constructor (private val entryDao: EntryDao) {
    suspend fun upsertEntry(entry: Entry) {
        return entryDao.upsertEntry(entry)
    }
}