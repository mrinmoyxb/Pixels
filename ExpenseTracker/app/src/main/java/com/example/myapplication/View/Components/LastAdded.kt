package com.example.myapplication.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LastAddedExpense(type: String, date: String, amount: String, description: String){
    Card(modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Transparent),
        shape = RoundedCornerShape(10.dp))
    {
        Box(modifier = Modifier.fillMaxSize()){

        }
    }
}