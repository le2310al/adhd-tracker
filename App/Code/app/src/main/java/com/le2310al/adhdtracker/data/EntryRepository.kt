package com.le2310al.adhdtracker.data.repository

import com.le2310al.adhdtracker.data.model.Entry
import kotlinx.coroutines.flow.Flow

interface EntryRepository {
    fun getAllEntries(): Flow<List<Entry>>
    suspend fun upsertEntry(entry: Entry)
    //suspend fun getEntry(dateTime: String): Entry
}