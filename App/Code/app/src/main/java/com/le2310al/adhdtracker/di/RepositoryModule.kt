package com.le2310al.adhdtracker.di

import com.le2310al.adhdtracker.domain.repository.EntryRepository
import com.le2310al.adhdtracker.data.repository.EntryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindEntryRepository(impl: EntryRepositoryImpl) : EntryRepository
}