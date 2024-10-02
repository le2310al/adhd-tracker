package com.le2310al.adhdtracker.ui.screen

import android.icu.util.Calendar
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.Settings
import com.le2310al.adhdtracker.ui.state.DiaryUiState
import com.le2310al.adhdtracker.ui.theme.Arrow_back
import com.le2310al.adhdtracker.ui.theme.Arrow_forward
import com.le2310al.adhdtracker.ui.theme.Settings_heart
import com.le2310al.adhdtracker.ui.viewmodel.EntryViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiaryScreen (
    navController: NavHostController,
    entryViewModel: EntryViewModel = hiltViewModel(),
    ) {
    val diaryState by entryViewModel.diaryState.collectAsStateWithLifecycle()
    val entryState by entryViewModel.entryState.collectAsStateWithLifecycle()

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    entryViewModel.navigateEntries(entryState.entries, diaryState.calendar)
    Log.i("INIT", diaryState.text)
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
                        diaryState.date,
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
                        //coroutineScope.launch {
                            val newDate = diaryState.calendar
                            newDate.add(Calendar.DAY_OF_MONTH, -1)
                            entryViewModel.navigateEntries(entryState.entries, newDate)
                        //}
                    }) {
                        Icon(Arrow_back, contentDescription = "Localized description")
                    }
                    IconButton(onClick = {
                        //coroutineScope.launch {
                            val newDate = diaryState.calendar
                            newDate.add(Calendar.DAY_OF_MONTH, 1)
                            entryViewModel.navigateEntries(entryState.entries, newDate)
                        //}
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
            DiaryFieldText(diaryState)
        }
    }
}

@Composable
fun DiaryFieldText(
    diaryState: DiaryUiState,
    entryViewModel: EntryViewModel = hiltViewModel(),
    ) {
    //val diaryState by diaryViewModel.uiState.collectAsStateWithLifecycle()
    val coroutineScope = rememberCoroutineScope()
    TextField(
        modifier = Modifier.fillMaxSize(),
        value = entryViewModel.text,
        onValueChange = {
            text -> entryViewModel.updateText(text)
            coroutineScope.launch {
                entryViewModel.saveEntry(diaryState.entryKey, text)
            }
        },
        label = { Text("How are you feeling today?") }
    )
}
/*
@Composable
fun DiaryTextField(
    coroutineScope: CoroutineScope,
    diaryViewModel: DiaryViewModel,
    entryViewModel: EntryViewModel,
) {
    val diaryState by diaryViewModel.uiState.collectAsState()
    //var text by remember { mutableStateOf(diaryViewModel.text) }
    if (diaryViewModel.text.isEmpty()) {
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = diaryViewModel.text,
            onValueChange = {
                diaryViewModel.text = it
                coroutineScope.launch {
                    entryViewModel.saveEntry(diaryState.entryKey, diaryViewModel.text)
                }
            },
            placeholder = { Text("How are you feeling today?") }
        )
    } else {
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = diaryViewModel.text,
            onValueChange = {
                diaryViewModel.text = it
                coroutineScope.launch {
                    entryViewModel.saveEntry(diaryState.entryKey, diaryViewModel.text)
                }
            },
        )
    }
}

if (diaryState.text == null) {
                var text by mutableStateOf("")
                TextField(
                    modifier = Modifier.fillMaxSize(),
                    value = text,
                    onValueChange = {
                        text = it
                        coroutineScope.launch {
                            entryViewModel.saveEntry(diaryState.entryKey, text)
                        }
                    },
                    placeholder = { Text("How are you feeling today?") }
                )
            } else {
                TextField(
                    modifier = Modifier.fillMaxSize(),
                    value = diaryState.text!!,
                    onValueChange = {
                        diaryState.text = it
                        coroutineScope.launch {
                            entryViewModel.saveEntry(diaryState.entryKey, diaryState.text!!)
                        }
                    },
                )
            }
 */