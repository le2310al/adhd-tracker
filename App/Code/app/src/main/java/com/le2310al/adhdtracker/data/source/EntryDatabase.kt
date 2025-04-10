package com.le2310al.adhdtracker.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.le2310al.adhdtracker.domain.model.Entry

@TypeConverters(Converters::class)
@Database(
     entities = [Entry::class],
     version = 1,
    exportSchema = false
 )
abstract class EntryDatabase: RoomDatabase() {
     abstract fun entryDao(): EntryDao
}

class Converters {
    @TypeConverter
    fun jsonToMap(value: String): Map<String, String>? {
        val mapType = object : TypeToken<Map<String, String>?>() {}.type
        return Gson().fromJson(value, mapType)
    }

    @TypeConverter
    fun mapToJson(map: Map<String, String>?): String {
        val gson = Gson()
        return gson.toJson(map)
    }
}