package com.le2310al.adhdtracker

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface EntryDao {
    @Upsert
    suspend fun upsertEntry(entry: Entry)
    @Delete
    suspend fun deleteEntry(entry: Entry)
    @Query("SELECT * FROM entry WHERE time = '2400'")
    fun getDailyEntries(entryDate: String): Flow<List<Entry>>
    @Query("SELECT * FROM entry WHERE time != '2400' ORDER BY date ASC, time ASC")
    fun getQuarterHourlyEntries(entryDate: String): Flow<List<Entry>>
}