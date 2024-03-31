package com.example.pixels.View

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pixels.R
import com.example.pixels.View.Components.EmergencyCard
import com.example.pixels.ViewModel.EmergencyContactViewModel
@Preview(showBackground = true)
@Composable
fun HomeScreen(){
    val viewModel: EmergencyContactViewModel = viewModel()

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp)){
        EmergencyCard(icon = R.drawable.personalcare, viewModel)
    }
}