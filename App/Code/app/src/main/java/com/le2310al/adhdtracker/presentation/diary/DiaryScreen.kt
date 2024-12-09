package com.le2310al.adhdtracker.presentation.diary

import android.icu.util.Calendar
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.presentation.AuxiliumState
import com.le2310al.adhdtracker.presentation.Graph
import com.le2310al.adhdtracker.presentation.Home
import com.le2310al.adhdtracker.presentation.MainViewModel
import com.le2310al.adhdtracker.presentation.UiState
import com.le2310al.adhdtracker.presentation.home.DateCard
import com.le2310al.adhdtracker.presentation.home.IconCard
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
    entries: AuxiliumState,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    vm.navigateEntries(entries.entries, uiState.calendar)
    Log.i("INIT", uiState.diary)
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
                        uiState.date,
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
                /*actions = {
                    IconButton(onClick = {
                        //coroutineScope.launch {
                        val newDate = uiState.calendar
                        newDate.add(Calendar.DAY_OF_MONTH, -1)
                        vm.navigateEntries(entries.entries, newDate)
                        //}
                    }) {
                        Icon(Arrow_back, contentDescription = "Localized description")
                    }
                    IconButton(onClick = {
                        //coroutineScope.launch {
                        val newDate = uiState.calendar
                        newDate.add(Calendar.DAY_OF_MONTH, 1)
                        vm.navigateEntries(entries.entries, newDate)
                        //}
                    }) {
                        Icon(Arrow_forward, contentDescription = "Localized description")
                    }
                },

                 */
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
                val yesterday = Calendar.getInstance()
                yesterday.add(Calendar.DATE, -1)
                val dayBeforeYesterday = Calendar.getInstance()
                dayBeforeYesterday.add(Calendar.DATE, -2)
                IconCard(vm, uiState, entries, Calendar_month)
                DateCard(vm, uiState, entries, dayBeforeYesterday, null)
                DateCard(vm, uiState, entries, yesterday, null)
                DateCard(vm, uiState, entries, Calendar.getInstance(), null)
            }
            DiaryFieldText(uiState)
        }
    }
}

@Composable
fun DiaryFieldText(
    uiState: UiState,
    vm: MainViewModel = hiltViewModel(),
) {
    //val uiState by diaryViewModel.uiState.collectAsStateWithLifecycle()
    //val coroutineScope = rememberCoroutineScope()
    TextField(
        modifier = Modifier.fillMaxSize(),
        value = uiState.diary,
        onValueChange = {
                text -> vm.updateText(text)
            //coroutineScope.launch {
                vm.saveEntry(uiState.key, text)
            //}
        },
        label = { Text("How are you feeling today?") }
    )
}
/*
@Composable
fun DiaryTextField(
    coroutineScope: CoroutineScope,
    diaryViewModel: DiaryViewModel,
    vm: EntryViewModel,
) {
    val uiState by diaryViewModel.uiState.collectAsState()
    //var text by remember { mutableStateOf(diaryViewModel.text) }
    if (diaryViewModel.text.isEmpty()) {
        TextField(
            modifier = Modifier.fillMaxSize(),
            value = diaryViewModel.text,
            onValueChange = {
                diaryViewModel.text = it
                coroutineScope.launch {
                    vm.saveEntry(uiState.entryKey, diaryViewModel.text)
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
                    vm.saveEntry(uiState.entryKey, diaryViewModel.text)
                }
            },
        )
    }
}

if (uiState.text == null) {
                var text by mutableStateOf("")
                TextField(
                    modifier = Modifier.fillMaxSize(),
                    value = text,
                    onValueChange = {
                        text = it
                        coroutineScope.launch {
                            vm.saveEntry(uiState.entryKey, text)
                        }
                    },
                    placeholder = { Text("How are you feeling today?") }
                )
            } else {
                TextField(
                    modifier = Modifier.fillMaxSize(),
                    value = uiState.text!!,
                    onValueChange = {
                        uiState.text = it
                        coroutineScope.launch {
                            vm.saveEntry(uiState.entryKey, uiState.text!!)
                        }
                    },
                )
            }
 */