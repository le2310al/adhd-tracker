package com.le2310al.adhdtracker

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@HiltViewModel
class EntryViewModel @Inject constructor(private val repository: EntryRepository): ViewModel() {
    private val _state = MutableStateFlow(EntryState())
    val state = _state

    fun onEvent(event: EntryEvent) {
        when(event) {
            is EntryEvent.AddDiary -> {
                val diary = state.value.diary
                if(diary.isBlank()) {
                    return
                }
                val entry = Entry (
                    date = SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString(),
                    time = SimpleDateFormat("hhmm", Locale.UK).format(Date()).toString(),
                    diary = state.value.diary
                )
                viewModelScope.launch {
                    repository.upsertEntry(entry)
                }
            }
        }
    }
}