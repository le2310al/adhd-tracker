package com.le2310al.adhdtracker.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.le2310al.adhdtracker.data.Entry
import com.le2310al.adhdtracker.data.EntryRepository
import com.le2310al.adhdtracker.ui.state.EntryUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EntryViewModel @Inject constructor(private val entryRepository: EntryRepository): ViewModel() {
    companion object {
        private const val MILLIS = 5_000L
    }
    val entryUiState: StateFlow<EntryUiState> =
        entryRepository.getAllEntries()
            .map { EntryUiState(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(MILLIS),
                initialValue = EntryUiState()
            )
    suspend fun saveEntry(entry: Entry) {
            viewModelScope.launch {
                entryRepository.upsertEntry(entry)
            }
        }
    /*
    suspend fun retrieveDiary(dateTime : String) : String{
        viewModelScope.launch {
            return
        }
    }

     */

    /*
    suspend fun getEntry(dateTime: String) {
        viewModelScope.launch {
            entryRepository.getEntry("202410012400")
        }
    }
     */
}

/*
date = SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString(),
time = SimpleDateFormat("hhmm", Locale.UK).format(Date()).toString(),
 */