package com.le2310al.adhdtracker.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.le2310al.adhdtracker.ui.state.DiaryUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class DiaryViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(DiaryUiState(Calendar.getInstance()))
    val uiState: StateFlow<DiaryUiState> = _uiState.asStateFlow()

    fun setDate(newDate : Calendar) {
        _uiState.update { currentState ->
            currentState.copy(
                date = newDate
            )
        }
    }
}