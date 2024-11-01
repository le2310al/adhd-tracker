package com.le2310al.adhdtracker.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface EntryDao {
    @Upsert
    suspend fun upsertEntry(entry: Entry)
    @Query("SELECT * FROM entry")
    fun getAllEntries() : Flow<List<Entry>>
    //@Query("SELECT * FROM entry WHERE dateTime = '202410012400'")
    //fun getEntry(dateTime: String): Entry
    /*
    @Delete
    suspend fun deleteEntry(entry: Entry)
    @Query("SELECT * FROM entry WHERE time = '2400'")
    fun getDailyEntries(entryDate: String): Flow<List<Entry>>
    @Query("SELECT * FROM entry WHERE time != '2400' ORDER BY date ASC, time ASC")
    fun getQuarterHourlyEntries(entryDate: String): Flow<List<Entry>>
     */
}