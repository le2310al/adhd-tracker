package com.le2310al.adhdtracker.data

import kotlinx.coroutines.flow.Flow

interface EntryRepository {
    fun getAllEntries(): Flow<List<Entry>>
    suspend fun upsertEntry(entry: Entry)
    //suspend fun getEntry(dateTime: String): Entry
}