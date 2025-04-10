package com.le2310al.adhdtracker.presentation

import android.icu.util.Calendar
import android.icu.text.SimpleDateFormat
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import java.util.Locale

@Composable
fun IconCard(
    vm: MainViewModel = hiltViewModel(),
    icon: ImageVector?,
    key: String,
    value: String
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {
            vm.setParameterValue(key, value)
        },
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
    icon: ImageVector?,
    offset: Int
) {
    val entries by vm.entries.collectAsStateWithLifecycle()
    val cal = Calendar.getInstance()
    cal.add(Calendar.DATE, offset)
    val entry = entries.entries.find { entry -> SimpleDateFormat(
        "yyyyMMdd",
        Locale.UK
    ).format(cal.time).toString().plus("0000") == entry.dateTime }

    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {
            vm.setCurrentEntry(cal, entry)},
        modifier = Modifier
            .size(width = 85.dp, height = 85.dp)
            .padding(5.dp)
    ) {
        Text(
            text = SimpleDateFormat("dd", Locale.UK).format(cal.time).toString(),
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

@Composable
fun DiaryFieldText(
    vm: MainViewModel,
    ui: UiState,
) {
    TextField(
        modifier = Modifier.fillMaxSize(),
        value = ui.parameters["Diary"]?:"",
        onValueChange = {
            vm.setParameterValue("Diary", it)
        },
        label = { Text("How are you feeling today?") }
    )
}

/*
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
    }
}

 */