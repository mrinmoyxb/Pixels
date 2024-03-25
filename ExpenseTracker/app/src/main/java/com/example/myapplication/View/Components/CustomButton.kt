package com.example.myapplication.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(text: String, fontSize: Int, boxColor: Color, textColor: Color){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .clickable { }
        .background(Color.Transparent),
        shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(boxColor)){
        Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.Center){
            Text(text, color = textColor, fontSize = fontSize.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}