package com.le2310al.adhdtracker.di

import android.content.Context
import androidx.room.Room
import com.le2310al.adhdtracker.data.EntryDao
import com.le2310al.adhdtracker.data.EntryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
    @Provides
    fun provideEntryDao(entryDatabase: EntryDatabase): EntryDao {
        return  entryDatabase.entryDao()
    }

    @Provides
    @Singleton
    fun provideEntryDatabase(@ApplicationContext context: Context): EntryDatabase {
        return Room.databaseBuilder(
            context = context,
            EntryDatabase::class.java,
            "entry_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}