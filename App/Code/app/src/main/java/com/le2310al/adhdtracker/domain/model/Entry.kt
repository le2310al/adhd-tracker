package com.le2310al.adhdtracker.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Entry(
    @PrimaryKey val dateTime: String,
    var diary: String?,
)
