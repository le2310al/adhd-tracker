package com.le2310al.adhdtracker.di

import android.content.Context
import com.le2310al.adhdtracker.AuxiliumApp
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
    fun provideBaseApplication(@ApplicationContext context: Context): AuxiliumApp {
        return context as AuxiliumApp
    }
}