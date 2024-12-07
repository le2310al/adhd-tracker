package com.le2310al.adhdtracker.data

import kotlinx.coroutines.flow.Flow

interface EntryRepository {
    fun getAllEntries(): Flow<List<Entry>> = entryDao.upsertEntry(entry)
    suspend fun upsertEntry(entry: Entry) = entryDao.getAllEntries()
    //suspend fun getEntry(dateTime: String): Entry = entryDao.getEntry(dateTime)
}