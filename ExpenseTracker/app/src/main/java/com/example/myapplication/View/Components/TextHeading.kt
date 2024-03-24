package com.example.myapplication.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextHeading(title: String, fontSize: Int, fontWeight: FontWeight, color: Color){
    Text(title, fontSize = fontSize.sp, fontWeight = fontWeight, color = color)
}