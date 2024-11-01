package com.le2310al.adhdtracker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.le2310al.adhdtracker.data.database.dao.EntryDao
import com.le2310al.adhdtracker.data.model.Entry

@Database(
     entities = [Entry::class],
     version = 1,
    exportSchema = false
 )
abstract class EntryDatabase: RoomDatabase() {
     abstract fun entryDao(): EntryDao
}