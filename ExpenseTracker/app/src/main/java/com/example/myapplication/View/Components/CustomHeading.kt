package com.example.myapplication.View.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SavingsHeading(height: Int, amount: String){
    val current = LocalConfiguration.current
    val width = current.screenWidthDp
    Card(modifier = Modifier
        .height(height.dp)
        .width(width.dp)
        .background(Color.Transparent),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(Color.Black)
    ){
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Text("$ ", fontSize = 32.sp, color = Color.White, fontWeight = FontWeight.SemiBold)
                Text(amount, fontSize = 32.sp, color = Color.White, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun display(){
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        SavingsHeading(height = 190, amount = "20000")
    }
}