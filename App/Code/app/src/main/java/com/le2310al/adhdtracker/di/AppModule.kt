package com.le2310al.adhdtracker.di

import android.content.Context
import com.le2310al.adhdtracker.AuxiliumApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideBaseApplication(@ApplicationContext context: Context): AuxiliumApplication {
        return context as AuxiliumApplication
    }
}