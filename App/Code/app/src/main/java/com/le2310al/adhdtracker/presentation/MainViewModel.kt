package com.le2310al.adhdtracker.presentation

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.util.Log
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

    private val _uiState = MutableStateFlow(UiState(
        SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date()).toString().plus("0000"),
        entries.value.entries.find { it.dateTime == SimpleDateFormat("yyyyMMdd", Locale.UK).format(Date())
            .toString().plus("0000") }?.parameters ?:mapOf("Diary" to "")
    ))
    val uiState: StateFlow<UiState> =  _uiState.asStateFlow()

    fun setCurrentEntry (cal: Calendar, entry: Entry?) {
        _uiState.update { currentState ->
            currentState.copy(
                key = SimpleDateFormat("yyyyMMdd", Locale.UK).format(cal.time) .toString().plus("0000"),
                parameters = entry?.parameters?:mapOf("Diary" to "")
            )
        }
        Log.i("PARAMS", _uiState.value.parameters.toString())
    }

    fun setParameterValue(key : String, value : String) {
        val parameters = mutableMapOf<String, String>()
        parameters.putAll(_uiState.value.parameters)
        parameters[key] = value
        _uiState.update { currentState ->
            currentState.copy(
                parameters = parameters,
            )
        }
        viewModelScope.launch {
            entryRepository.upsertEntry(Entry(uiState.value.key, parameters))
        }
    }
}
