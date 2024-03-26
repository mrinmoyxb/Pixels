package com.example.myapplication.View.S3_DepositWithdrawScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
fun AddEarningsScreen(){

    val options = listOf(
        Item("Business Profits", R.drawable.profit),
        Item("Capital Gains", R.drawable.gain),
        Item("Commissions", R.drawable.commissions),
        Item("Dividends", R.drawable.dividends),
        Item("Interests", R.drawable.interest),
        Item("Salary", R.drawable.salary),
        Item("Wages", R.drawable.wages),
        Item("Others", R.drawable.others),
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(40.dp))

            // Heading
            TextHeading(title = "Add your Earnings", fontSize = 35, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(modifier = Modifier.height(25.dp))

            // Add amount
            TextHeading(title = "Amount", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            Spacer(modifier = Modifier.height(4.dp))
            CustomTextInput("Enter amount")
            Spacer(modifier = Modifier.height(10.dp))

            // Expense type(drop down menu):
            TextHeading(title = "Earning type", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            Spacer(modifier = Modifier.height(4.dp))
            CustomDropDownMenu(options, "Select an earning type")
            Spacer(modifier = Modifier.height(10.dp))

            // Enter description:
            TextHeading(title = "Description", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            Spacer(modifier = Modifier.height(4.dp))
            CustomTextInput("Write a short description...")
            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(text = "Done", fontSize = 25, boxColor = colorResource(id = R.color.primary), textColor = Color.White)
        }
    }
}