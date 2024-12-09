package com.le2310al.adhdtracker.data.repository

import com.le2310al.adhdtracker.data.source.EntryDao
import com.le2310al.adhdtracker.domain.model.Entry
import com.le2310al.adhdtracker.domain.repository.EntryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EntryRepositoryImpl @Inject constructor(private val entryDao: EntryDao):
    EntryRepository {
    override suspend fun upsertEntry(entry: Entry) = entryDao.upsertEntry(entry)
    //override suspend fun getEntry(dateTime: String): Entry = entryDao.getEntry(dateTime)
    override fun getAllEntries(): Flow<List<Entry>> = entryDao.getAllEntries()
}