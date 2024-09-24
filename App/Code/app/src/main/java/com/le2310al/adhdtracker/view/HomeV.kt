package com.le2310al.adhdtracker.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.le2310al.adhdtracker.viewModel.HomeVM

@Composable
fun HomeV(modifier: Modifier = Modifier, viewModel: HomeVM) {
    val userData = viewModel.userData.observeAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            viewModel.getUserData()
        }) {
            Text(text="GetData")
        }
        userData.value?.name?.let {
            Text(text="NAME $it")
        }
    }
}