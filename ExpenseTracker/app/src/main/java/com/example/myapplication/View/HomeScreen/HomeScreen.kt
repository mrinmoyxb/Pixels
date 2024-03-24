package com.example.myapplication.View.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.View.Components.SavingsHeading

@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        SavingsHeading(height = 190, amount = "20000")
        LazyColumn {
            item{

            }
        }

    }
}