package com.example.myapplication.View.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextInput(){
    var value by remember{mutableStateOf("")}
    TextField(value = value, onValueChange = {value = it},
        placeholder = {Text("Enter Amount", fontSize =  25.sp, color = Color.Black)},
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(fontSize = 30.sp, color = Color.Black, fontWeight = FontWeight.SemiBold),
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent,
            focusedIndicatorColor = Color.Black
        )
    )
}