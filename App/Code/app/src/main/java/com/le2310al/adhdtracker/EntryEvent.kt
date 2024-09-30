package com.le2310al.adhdtracker

sealed interface EntryEvent {
    data class AddDiary(val diary: String): EntryEvent
}