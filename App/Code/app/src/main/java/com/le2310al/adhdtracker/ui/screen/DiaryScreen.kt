package com.le2310al.adhdtracker.ui.screen

import android.icu.text.SimpleDateFormat
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.Settings
import com.le2310al.adhdtracker.data.Entry
import com.le2310al.adhdtracker.ui.state.DiaryUiState
import com.le2310al.adhdtracker.ui.state.EntryUiState
import com.le2310al.adhdtracker.ui.theme.Arrow_back
import com.le2310al.adhdtracker.ui.theme.Arrow_forward
import com.le2310al.adhdtracker.ui.theme.Settings_heart
import com.le2310al.adhdtracker.ui.viewmodel.DiaryViewModel
import com.le2310al.adhdtracker.ui.viewmodel.EntryViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.Calendar
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiaryScreen (
    navController: NavHostController,
    entryViewModel: EntryViewModel = hiltViewModel(),
    diaryViewModel: DiaryViewModel = hiltViewModel()
) {
    val diaryUiState by diaryViewModel.uiState.collectAsState()
    val data by entryViewModel.entryUiState.collectAsState()
    val coroutineScope = rememberCoroutineScope()
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
                        SimpleDateFormat("dd MMM yyyy", Locale.UK).format(diaryUiState.date.time).toString(),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()}) {
                        Icon(
                            Arrow_back,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { navController.navigate(Settings) }) {
                        Icon(
                            Settings_heart,
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
                    IconButton(onClick = {
                        val newDate = diaryUiState.date
                        newDate.add(Calendar.DAY_OF_MONTH, -1)
                        diaryViewModel.setDate(newDate)
                        val diaryDateTime = java.text.SimpleDateFormat(
                            "yyyyMMdd",
                            Locale.UK
                        ).format(diaryUiState.date.time).toString().plus("2400")
                        Log.i("tag", diaryDateTime)
                    }) {
                        Icon(Arrow_back, contentDescription = "Localized description")
                    }
                    IconButton(onClick = {
                        val newDate = diaryUiState.date
                        newDate.add(Calendar.DAY_OF_MONTH, 1)
                        diaryViewModel.setDate(newDate)
                        val diaryDateTime = java.text.SimpleDateFormat(
                            "yyyyMMdd",
                            Locale.UK
                        ).format(diaryUiState.date.time).toString().plus("2400")
                        Log.i("tag", diaryDateTime)
                    }) {
                        Icon(Arrow_forward, contentDescription = "Localized description")
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
            DiaryTextField(coroutineScope, entryViewModel, data, diaryUiState)

        }
    }
}

@Composable
fun DiaryTextField(
    coroutineScope: CoroutineScope,
    entryViewModel: EntryViewModel,
    data: EntryUiState,
    diary: DiaryUiState,
) {
    val diaryDateTime = java.text.SimpleDateFormat(
        "yyyyMMdd",
        Locale.UK
    ).format(diary.date.time).toString().plus("2400")
    val entry = data.entries.find {it.dateTime == diaryDateTime }
    val text = entry?.text
    if (text != null) {
        var diaryEntry by remember { mutableStateOf(text) }
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = diaryEntry,
            onValueChange = {
                diaryEntry = it
                coroutineScope.launch {
                    entryViewModel.saveEntry(Entry(diaryDateTime, diaryEntry))
                }
            },
            placeholder = { Text("How are you feeling today?") }
        )
    } else {
        var diaryEntry by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = diaryEntry,
            onValueChange = {
                diaryEntry = it
                coroutineScope.launch {
                    entryViewModel.saveEntry(Entry(diaryDateTime, diaryEntry))
                }
            },
            placeholder = { Text("How are you feeling today?") }
        )
    }
}