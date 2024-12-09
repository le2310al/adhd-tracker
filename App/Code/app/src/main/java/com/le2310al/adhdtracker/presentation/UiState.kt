package com.le2310al.adhdtracker.presentation

import android.icu.util.Calendar

data class UiState(
    val calendar: Calendar,
    val date: String,
    val key: String,
    var diary: String,
)
