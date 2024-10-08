package com.le2310al.adhdtracker.ui.screen

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
import androidx.navigation.NavHostController
import com.le2310al.adhdtracker.Diary
import com.le2310al.adhdtracker.Graph
import com.le2310al.adhdtracker.Home
import com.le2310al.adhdtracker.Settings
import com.le2310al.adhdtracker.ui.theme.Arrow_back
import com.le2310al.adhdtracker.ui.theme.Calendar_month
import com.le2310al.adhdtracker.ui.theme.Edit_document
import com.le2310al.adhdtracker.ui.theme.Family_home
import com.le2310al.adhdtracker.ui.theme.Query_stats
import com.le2310al.adhdtracker.ui.theme.Schedule
import com.le2310al.adhdtracker.ui.theme.Settings_heart
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    navController : NavHostController,
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
                            SimpleDateFormat("dd MMM HH:mm", Locale.UK).format(Date()).toString(),
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
                    DateCard(null, Calendar_month)
                    DateCard(SimpleDateFormat("dd", Locale.UK).format(dayBeforeYesterday.time), null)
                    DateCard(SimpleDateFormat("dd", Locale.UK).format(yesterday.time), null)
                    DateCard(SimpleDateFormat("dd", Locale.UK).format(Date()), null)
                }
                TimeSlider()
            }
        }
}

@Composable
fun DateCard(
    cardName: String?, icon: ImageVector?
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .size(width = 85.dp, height = 85.dp)
            .padding(5.dp)
    ) {
        if (cardName != null) {
            Text(
                text = "$cardName",
                modifier = Modifier
                    .height(85.dp)
                    .width(85.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically),
                textAlign = TextAlign.Center
            )
        }
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