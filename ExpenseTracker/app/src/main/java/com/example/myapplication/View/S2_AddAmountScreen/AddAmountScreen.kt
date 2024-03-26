package com.example.myapplication.View.S2_AddAmountScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.Model.TextConstants
import com.example.myapplication.R
import com.example.myapplication.View.Components.DepositWithdrawCard
import com.example.myapplication.View.Components.TextHeading

@Composable
fun AddAmountScreen(navHostController: NavHostController){
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp
    val height: Int = 210

    Column(modifier = Modifier.fillMaxSize().padding(10.dp)){

        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            // Heading
            TextHeading(
                title = "Add", fontSize = TextConstants.Heading.size,
                fontWeight = FontWeight.SemiBold, color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(15.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                // Earnings
                DepositWithdrawCard(text = "Earnings", icon = Icons.Filled.ArrowForward,
                    height = (height/2)-2, width = ((screenWidth)/ 2)-12,
                    boxColor = colorResource(id = R.color.primary), fontSize = 20, navHostController = navHostController, route = "earningsScreen")

                // Expenses
                DepositWithdrawCard(text = "Expenses", icon = Icons.Filled.ArrowBack,
                    height = (height/2)-2, width = ((screenWidth)/ 2)-12,
                    boxColor = colorResource(id = R.color.primary), fontSize = 20, navHostController = navHostController, route = "expensesScreen")
            }
        }

}