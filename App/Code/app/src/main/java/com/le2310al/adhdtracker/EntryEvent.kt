package com.le2310al.adhdtracker

sealed interface EntryEvent {
    object addDiary: EntryEvent
    data class setDiary(val diary: String?): EntryEvent
}