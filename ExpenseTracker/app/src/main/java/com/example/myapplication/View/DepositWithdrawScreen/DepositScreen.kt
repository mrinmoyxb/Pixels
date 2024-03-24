package com.example.myapplication.View.DepositWithdrawScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.View.Components.CustomTextInput
import com.example.myapplication.View.Components.TextHeading

@Preview(showBackground = true)
@Composable
fun AddAmountScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(40.dp))


            TextHeading(title = "Amount", fontSize = 25, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomTextInput("Enter amount")
            Spacer(modifier = Modifier.height(10.dp))

            TextHeading(title = "Description", fontSize = 25, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomTextInput("Enter a short description")
            Spacer(modifier = Modifier.height(10.dp))

            TextHeading(title = "Amount", fontSize = 25, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomTextInput("Enter amount")
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}