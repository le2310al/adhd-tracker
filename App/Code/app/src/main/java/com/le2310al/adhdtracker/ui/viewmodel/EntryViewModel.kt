package com.le2310al.adhdtracker.ui.viewmodel

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.le2310al.adhdtracker.data.Entry
import com.le2310al.adhdtracker.data.EntryRepository
import com.le2310al.adhdtracker.ui.state.DiaryUiState
import com.le2310al.adhdtracker.ui.state.EntryUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class EntryViewModel @Inject constructor(private val entryRepository: EntryRepository): ViewModel() {
    val entryState: StateFlow<EntryUiState> =
    entryRepository.getAllEntries()
        .map { EntryUiState(it) }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000L),
            initialValue = EntryUiState()
        )

    suspend fun saveEntry(entryKey : String, text : String) {
        Log.i("SAVED", text)
            viewModelScope.launch {
                entryRepository.upsertEntry(Entry(entryKey, text))
            }
        }

    private val _uiState = MutableStateFlow(DiaryUiState(
        Calendar.getInstance(),
        SimpleDateFormat("dd MMM yyyy", Locale.UK).format(Date()).toString(),
        SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString().plus("2400"),
        entryState.value.entries.find { it.dateTime == SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString().plus("2400") }?.text?:""
    ))
    val diaryState: StateFlow<DiaryUiState> =  _uiState.asStateFlow()

    var text by mutableStateOf("")
        private set

    fun updateText(input: String) {
        text = input
    }

    fun navigateEntries(entries : List<Entry>, nextEntry : Calendar) {
        _uiState.update { currentState ->
            currentState.copy(
                calendar = nextEntry,
                date = SimpleDateFormat("dd MM yyyy", Locale.UK).format(nextEntry.time)
                    .toString(),
                entryKey = SimpleDateFormat("yyyyMMdd", Locale.UK).format(nextEntry.time)
                    .toString().plus("2400"),
                text = "",
            )
        }
        val temp = entries.find { it.dateTime == _uiState.value.entryKey }
        if (temp != null) {
            _uiState.value.text = temp.text.toString()
        } else {
            _uiState.value.text = ""
        }
        updateText(_uiState.value.text)
        _uiState.value.text.let { Log.i("DIARY UPDATE", it) }
    }
}