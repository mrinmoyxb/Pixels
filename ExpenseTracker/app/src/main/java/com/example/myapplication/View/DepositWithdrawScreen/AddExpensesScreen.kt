package com.example.myapplication.View.DepositWithdrawScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.View.Components.CustomButton
import com.example.myapplication.View.Components.CustomDropDownMenu
import com.example.myapplication.View.Components.CustomTextInput
import com.example.myapplication.View.Components.Item
import com.example.myapplication.View.Components.TextHeading

@Preview(showBackground = true)
@Composable
fun AddExpensesScreen(){

    val options = listOf(
        Item("Bills", R.drawable.bills),
        Item("Debt", R.drawable.debt),
        Item("Entertainment", R.drawable.entertainment),
        Item("Food", R.drawable.soup),
        Item("Health Insurance", R.drawable.health),
        Item("Housing", R.drawable.home),
        Item("Personal Care", R.drawable.personal),
        Item("Shopping", R.drawable.shopping),
        Item("Transportation", R.drawable.plane),
        Item("Utilities", R.drawable.utilities),

    )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(40.dp))

            // Heading
            TextHeading(title = "Add your Expenses", fontSize = 35, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(25.dp))

            // Add amount
            TextHeading(title = "Amount", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomTextInput("Enter amount")
            Spacer(modifier = Modifier.height(10.dp))

            // Expense type:
            TextHeading(title = "Expense type", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomDropDownMenu(options, "Select an expense type")
            Spacer(modifier = Modifier.height(10.dp))

            // Enter description:
            TextHeading(title = "Description", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            CustomTextInput("Write a short description...")
            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(text = "Done", fontSize = 25, boxColor = colorResource(id = R.color.primary), textColor = Color.White)
        }
    }
}