package com.le2310al.adhdtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.le2310al.adhdtracker.ui.theme.AdhdTrackerTheme
import kotlinx.serialization.Serializable
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import com.le2310al.adhdtracker.ui.DiaryScreen
import com.le2310al.adhdtracker.ui.GraphScreen
import com.le2310al.adhdtracker.ui.HomeScreen
import com.le2310al.adhdtracker.ui.SettingsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).build()
        val userDao = db.userDao()
        val users: List<User> = userDao.getAll()
        println(users)
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
@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}