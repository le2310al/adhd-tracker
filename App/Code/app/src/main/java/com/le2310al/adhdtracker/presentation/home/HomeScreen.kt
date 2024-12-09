package com.le2310al.adhdtracker.presentation.home

import android.icu.util.Calendar
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.presentation.AuxiliumState
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
import com.le2310al.adhdtracker.presentation.ui.theme.Schedule
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_dissatisfied
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_neutral
import com.le2310al.adhdtracker.presentation.ui.theme.Sentiment_satisfied
import com.le2310al.adhdtracker.presentation.ui.theme.Settings_heart
import java.text.SimpleDateFormat
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    navController: NavHostController,
    vm: MainViewModel,
    uiState: UiState,
    entries: AuxiliumState,
) {
    //vm.navigateEntries(entries.entries, uiState.calendar)
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
                            uiState.date,
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
                    val yesterday = Calendar.getInstance()
                    yesterday.add(Calendar.DATE, -1)
                    val dayBeforeYesterday = Calendar.getInstance()
                    dayBeforeYesterday.add(Calendar.DATE, -2)
                    IconCard(vm, uiState, entries, Calendar_month)
                    DateCard(vm, uiState, entries, dayBeforeYesterday, null)
                    DateCard(vm, uiState, entries, yesterday, null)
                    DateCard(vm, uiState, entries, Calendar.getInstance(), null)
                }
                //TimeSlider()
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ){
                    IconCard(vm, uiState, entries, Sentiment_dissatisfied)
                    IconCard(vm, uiState, entries, Sentiment_neutral)
                    IconCard(vm, uiState, entries, Sentiment_satisfied)
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                ){
                    IconCard(vm, uiState, entries, Routine)
                    IconCard(vm, uiState, entries, Pill_off)
                    IconCard(vm, uiState, entries, Nutrition)
                    IconCard(vm, uiState, entries, Egg_alt)
                }
                SSSlider()
                SSSlider()
                SSSlider()
                SSSlider()
            }
        }
}

@Composable
fun SSSlider() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    Column (modifier = Modifier.padding(horizontal = 50.dp)) {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = MaterialTheme.colorScheme.secondary,
                activeTrackColor = MaterialTheme.colorScheme.secondary,
                inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
            ),
            steps = 3,
            valueRange = 0f..50f
        )
        //Text(text = sliderPosition.toString())
    }
}

@Composable
fun IconCard(
    vm: MainViewModel = hiltViewModel(),
    uiState: UiState,
    entries: AuxiliumState,
    icon: ImageVector?
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {},
        modifier = Modifier
            .size(width = 85.dp, height = 85.dp)
            .padding(5.dp)
    ) {
        if (icon != null) {
            Icon (
                icon,
                "Localized description",
                modifier = Modifier
                    .height(85.dp)
                    .width(85.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically),
            )
        }

    }
}

@Composable
fun DateCard(
    vm: MainViewModel = hiltViewModel(),
    uiState: UiState,
    entries: AuxiliumState,
    cardName: Calendar,
    icon: ImageVector?
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {
            vm.navigateEntries(entries.entries, cardName)},
        modifier = Modifier
            .size(width = 85.dp, height = 85.dp)
            .padding(5.dp)
    ) {
        Text(
            text = SimpleDateFormat("dd", Locale.UK).format(cardName.time).toString(),
            modifier = Modifier
                .height(85.dp)
                .width(85.dp)
                .wrapContentHeight(align = Alignment.CenterVertically),
            textAlign = TextAlign.Center
        )
        if (icon != null) {
            Icon (
                icon,
                "Localized description",
                modifier = Modifier
                    .height(85.dp)
                    .width(85.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically),
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimeSlider() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    val interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    Column(modifier = Modifier.padding(horizontal = 30.dp)) {
        Slider(
            modifier = Modifier.semantics { contentDescription = "Localized Description" },
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..24f,
            steps =  47,
            interactionSource = interactionSource,
            onValueChangeFinished = {
                // launch some business logic update with the state you hold
                // viewModel.updateSelectedSliderValue(sliderPosition)
            },
            thumb = {
                Label(
                    label = {
                        //PlainTooltip(modifier = Modifier.sizeIn(45.dp, 25.dp).wrapContentWidth()) {
                            //Text("%.2f".format(sliderPosition))
                        //}
                    },
                    interactionSource = interactionSource
                ) {
                    Icon(
                        imageVector = Schedule,
                        contentDescription = null,
                        modifier = Modifier.size(ButtonDefaults.IconSize),
                        //tint = Color.Red
                    )
                }
            }
        )
    }
}