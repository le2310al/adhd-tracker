package com.le2310al.adhdtracker.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.le2310al.adhdtracker.domain.model.Entry

@Database(
     entities = [Entry::class],
     version = 1,
    exportSchema = false
 )
abstract class EntryDatabase: RoomDatabase() {
     abstract fun entryDao(): EntryDao
}