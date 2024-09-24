package com.le2310al.adhdtracker.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.le2310al.adhdtracker.model.UserData
import com.le2310al.adhdtracker.model.UserRepository
import kotlinx.coroutines.launch

class HomeVM : ViewModel() {
    val userRepository : UserRepository = UserRepository()
    private val _userData = MutableLiveData<UserData>()
    val userData : LiveData<UserData> = _userData
    fun getUserData(){
        viewModelScope.launch() {
            val userResult = userRepository.fetchUserData()
            _userData.postValue(userResult)
        }
    }
}