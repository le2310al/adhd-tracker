package com.le2310al.adhdtracker

import androidx.room.Database
import androidx.room.RoomDatabase

 @Database(
     entities = [Entry::class],
     version = 1
 )
abstract class EntryDatabase: RoomDatabase() {
    abstract val entryDao: EntryDao
}