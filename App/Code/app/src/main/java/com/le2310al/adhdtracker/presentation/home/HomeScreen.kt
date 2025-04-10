package com.le2310al.adhdtracker.presentation.home

import kotlinx.datetime.*
import kotlinx.datetime.format.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.presentation.Diary
import com.le2310al.adhdtracker.presentation.Graph
import com.le2310al.adhdtracker.presentation.Home
import com.le2310al.adhdtracker.presentation.MainViewModel
import com.le2310al.adhdtracker.presentation.Settings
import com.le2310al.adhdtracker.presentation.UiState
import com.le2310al.adhdtracker.presentation.ui.theme.Arrow_back
import com.le2310al.adhdtracker.presentation.ui.theme.Calendar_month
import com.le2310al.adhdtracker.presentation.ui.theme.Edit_document
import com.le2310al.adhdtracker.presentation.ui.theme.Egg_alt
import com.le2310al.adhdtracker.presentation.ui.theme.Family_home
import com.le2310al.adhdtracker.presentation.ui.theme.Nutrition
import com.le2310al.adhdtracker.presentation.ui.theme.Pill_off
import com.le2310al.adhdtracker.presentation.ui.theme.Query_stats
import com.le2310al.adhdtracker.presentation.ui.theme.Routine
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_dissatisfied
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_neutral
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_satisfied
import com.le2310al.adhdtracker.presentation.ui.theme.Settings_heart
import com.le2310al.adhdtracker.presentation.DateCard
import com.le2310al.adhdtracker.presentation.IconCard

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    navController: NavHostController,
    vm: MainViewModel = hiltViewModel(),
    uiState: UiState,
) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            topBar = {
                CenterAlignedTopAppBar(
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Text(
                            LocalDateTime.parse(uiState.key, LocalDateTime.Format { date (LocalDate.Format{year(); monthNumber(); dayOfMonth()}); time( LocalTime.Format { hour(); minute() })})
                                .format(LocalDateTime.Format { date (LocalDate.Format{dayOfMonth(); char(' '); monthName(MonthNames.ENGLISH_ABBREVIATED); char(' '); year()})}),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {navController.popBackStack()}) {
                            Icon(imageVector = Arrow_back, contentDescription = "Localized description")
                        }
                    },
                    actions = {
                        IconButton(onClick = { navController.navigate(Settings) }) {
                            Icon(imageVector = Settings_heart, contentDescription = "Localized description")
                        }
                    },
                    scrollBehavior = scrollBehavior,
                )
            },
            bottomBar = {
                BottomAppBar(
                    actions = {
                        IconButton(onClick = { navController.navigate(Graph(null)) }) {
                            Icon(Query_stats, contentDescription = "Localized description")
                        }
                        IconButton(onClick = {navController.navigate(Home(null)) }) {
                            Icon(Family_home, contentDescription = "Localized description")
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { navController.navigate(Diary(null))},
                            containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                            elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                        ) {
                            Icon(Edit_document, contentDescription = "Localized description")
                        }
                    }
                )
            },
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Top,
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ){
                    IconCard(vm, Calendar_month, "Mood", "0") //change this
                    DateCard(vm, null, -2)
                    DateCard(vm, null, -1)
                    DateCard(vm, null, 0)
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ){
                    IconCard(vm,Sentiment_dissatisfied, "Mood", "0")
                    IconCard(vm, Sentiment_neutral,"Mood", "1")
                    IconCard(vm, Sentiment_satisfied,"Mood", "2")
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ){
                    IconCard(vm, Routine, "Mood", "0")
                    IconCard(vm,Pill_off, "Mood", "0")
                    IconCard(vm,Nutrition, "Mood", "0")
                    IconCard(vm,Egg_alt, "Mood", "0")
                }
                /*
                SSSlider()
                SSSlider()
                SSSlider()
                SSSlider()
                 */
            }
        }
}
