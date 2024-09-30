package com.le2310al.adhdtracker

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Entry(
    val date: String,
    val time: String,
    val diary: String?,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
)
