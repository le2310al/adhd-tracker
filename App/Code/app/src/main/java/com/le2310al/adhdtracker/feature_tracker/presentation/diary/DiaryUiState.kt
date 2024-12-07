package com.le2310al.adhdtracker.ui.state

import android.icu.util.Calendar

data class DiaryUiState (
    val calendar: Calendar,
    val date: String,
    val entryKey: String,
    var text: String,
)