package com.example.myapplication.View.S4_AnalyticsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.Model.TextConstants
import com.example.myapplication.View.Components.TextHeading
import com.example.myapplication.R
import com.example.myapplication.ViewModel.AnalyticsViewModel.AnalyticsViewModel


@Composable
fun AnalyticsScreen(navHostController: NavHostController, viewModel: AnalyticsViewModel){

    val earnings = viewModel.getEarnings.collectAsState(0.0)
    val expenses = viewModel.getExpenses.collectAsState(0.0)


    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.black_primary))
        .padding(10.dp)){
        Spacer(modifier = Modifier.height(40.dp))

        // heading
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            TextHeading(
                title = "Analytics",
                fontSize = TextConstants.Heading.size,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        TextHeading(title = earnings.value.toString(), fontSize = 20, fontWeight = FontWeight.SemiBold, color = Color.White)

        //
    }
}