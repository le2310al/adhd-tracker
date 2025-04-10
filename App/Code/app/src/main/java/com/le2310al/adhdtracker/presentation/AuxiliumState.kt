package com.le2310al.adhdtracker.presentation

import com.le2310al.adhdtracker.domain.model.Entry

data class AuxiliumState(
    val entries: List<Entry> = listOf(),
)