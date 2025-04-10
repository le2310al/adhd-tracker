package com.le2310al.adhdtracker.presentation.diary

import android.annotation.SuppressLint
import kotlinx.datetime.*
import kotlinx.datetime.format.*
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.le2310al.adhdtracker.presentation.DiaryFieldText
import com.le2310al.adhdtracker.presentation.DateCard
import com.le2310al.adhdtracker.presentation.IconCard
import com.le2310al.adhdtracker.presentation.Graph
import com.le2310al.adhdtracker.presentation.Home
import com.le2310al.adhdtracker.presentation.MainViewModel
import com.le2310al.adhdtracker.presentation.UiState
import com.le2310al.adhdtracker.presentation.ui.theme.Arrow_back
import com.le2310al.adhdtracker.presentation.ui.theme.Calendar_month
import com.le2310al.adhdtracker.presentation.ui.theme.Family_home
import com.le2310al.adhdtracker.presentation.ui.theme.Query_stats

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiaryScreen (
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
                        LocalDateTime.parse(uiState.key, LocalDateTime.Format { date (
                            LocalDate.Format{year(); monthNumber(); dayOfMonth()}); time( LocalTime.Format { hour(); minute() })})
                            .format(LocalDateTime.Format { date (LocalDate.Format{dayOfMonth(); char(' '); monthName(
                                MonthNames.ENGLISH_ABBREVIATED); char(' '); year()})}),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        if (!navController.popBackStack()) {
                            navController.navigate(Home)
                        }
                        }) {
                        Icon(
                            Arrow_back,
                            contentDescription = "Localized description"
                        )
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
                }
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ){
                IconCard(vm, Calendar_month, "cal", "0") //fix
                DateCard(vm, null, -2)
                DateCard(vm, null, -1)
                DateCard(vm, null, 0)
            }
            DiaryFieldText(vm, uiState)
        }
    }
}
