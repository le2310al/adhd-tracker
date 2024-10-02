package com.le2310al.adhdtracker.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EntryRepositoryImplementation @Inject constructor(private val entryDao: EntryDao):
    EntryRepository {
    override suspend fun upsertEntry(entry: Entry) = entryDao.upsertEntry(entry)
    //override suspend fun getEntry(dateTime: String): Entry = entryDao.getEntry(dateTime)
    override fun getAllEntries(): Flow<List<Entry>> = entryDao.getAllEntries()
}