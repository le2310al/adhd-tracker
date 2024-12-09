package com.le2310al.adhdtracker.domain.repository

import com.le2310al.adhdtracker.domain.model.Entry
import kotlinx.coroutines.flow.Flow

interface EntryRepository {
    fun getAllEntries(): Flow<List<Entry>>
    suspend fun upsertEntry(entry: Entry)
    //suspend fun getEntry(dateTime: String): Entry
}