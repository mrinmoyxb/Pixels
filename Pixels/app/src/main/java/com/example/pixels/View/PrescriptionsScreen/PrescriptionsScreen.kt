package com.example.pixels.View.PrescriptionsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PrescriptionsScreen(){
    var heading by remember{mutableStateOf("")}
    var doctorName by remember{mutableStateOf("")}
    var descriptions by remember{mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp)){
        TextField(value = heading, onValueChange = {heading = it},
            placeholder = {Text("Write a heading", fontSize = 20.sp, color = Color.Black)}
            )
    }
}