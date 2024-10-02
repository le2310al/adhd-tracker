package com.le2310al.adhdtracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Entry(
    @PrimaryKey val dateTime: String,
    val text: String?,
)
