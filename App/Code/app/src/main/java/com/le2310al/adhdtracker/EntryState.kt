package com.le2310al.adhdtracker

data class EntryState (
    val entries: List<Entry> = emptyList(),
    val date: String = "",
    val time: String = "",
    val diary: String = "",
)