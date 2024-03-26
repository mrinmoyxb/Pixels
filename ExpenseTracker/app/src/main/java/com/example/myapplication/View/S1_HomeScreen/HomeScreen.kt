package com.example.myapplication.View.S1_HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.View.Components.SavingsHeading


@Composable
fun HomeScreen(navController: NavHostController){
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp
    val height: Int = 210

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        // balance
        SavingsHeading(height = height, width = screenWidth, amount = "20000")
        Button(onClick = { navController.navigate("addAmountScreen")}) {
            Text("Click Here")
        }
            LazyColumn {
                item {

                }
            }

        }
}