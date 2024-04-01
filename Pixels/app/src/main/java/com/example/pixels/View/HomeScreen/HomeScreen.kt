package com.example.pixels.View.HomeScreen

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        .padding(10.dp))
    {
        Spacer(modifier = Modifier.height(40.dp))

        // Heading
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
            Text(text = stringResource(id = R.string.emergency), fontSize = 32.sp, color = Color.Black, fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.height(15.dp))

        // Row 1
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            EmergencyCard(
                icon = painterResource(id = R.drawable.ambulance_black),
                viewModel,
                "108",
                stringResource(id = R.string.ambulance)
            )
            EmergencyCard(
                icon = painterResource(id = R.drawable.disaster),
                viewModel,
                "1077",
                stringResource(id = R.string.districtEmergency)
            )
            EmergencyCard(
                icon = painterResource(id = R.drawable.fire_station),
                viewModel,
                "101",
                stringResource(id = R.string.fireStation)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        // Row 2
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            EmergencyCard(
                icon = painterResource(id = R.drawable.medical_care),
                viewModel,
                "000",
                stringResource(id = R.string.mobileCenter)
            )
            EmergencyCard(
                icon = painterResource(id = R.drawable.police_station),
                viewModel,
                "100",
                stringResource(id = R.string.policeStation)
            )
            EmergencyCard(
                icon = painterResource(id = R.drawable.women_helpline),
                viewModel,
                "181",
                stringResource(id = R.string.womenHelpline)
            )
        }
    }
}