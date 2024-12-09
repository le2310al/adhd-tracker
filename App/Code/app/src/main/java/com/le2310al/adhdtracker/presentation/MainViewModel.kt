package com.le2310al.adhdtracker.presentation

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.le2310al.adhdtracker.domain.model.Entry
import com.le2310al.adhdtracker.domain.repository.EntryRepository
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
class MainViewModel @Inject constructor(private val entryRepository: EntryRepository): ViewModel() {
    val entries: StateFlow<AuxiliumState> =
        entryRepository.getAllEntries().map { AuxiliumState(it) }
            .stateIn(
                viewModelScope,
                SharingStarted.WhileSubscribed(5000L),
                AuxiliumState()
            )

    fun saveEntry(key : String, text : String) {
        Log.i("SAVED", text)
        viewModelScope.launch {
            entryRepository.upsertEntry(Entry(key, text))
        }
    }

    private val _uiState = MutableStateFlow(UiState(
        Calendar.getInstance(),
        SimpleDateFormat("dd MMM yyyy", Locale.UK).format(Date()).toString(),
        SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString().plus("2400"),
        entries.value.entries.find { it.dateTime == SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString().plus("2400") }?.diary?:""
    ))
    val uiState: StateFlow<UiState> =  _uiState.asStateFlow()

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
                key = SimpleDateFormat("yyyyMMdd", Locale.UK).format(nextEntry.time)
                    .toString().plus("2400"),
                diary = "",
            )
        }
        val temp = entries.find { it.dateTime == _uiState.value.key }
        if (temp != null) {
            _uiState.value.diary = temp.diary.toString()
        } else {
            _uiState.value.diary = ""
        }
        updateText(_uiState.value.diary)
        _uiState.value.diary.let { Log.i("DIARY UPDATE", it) }
    }
}