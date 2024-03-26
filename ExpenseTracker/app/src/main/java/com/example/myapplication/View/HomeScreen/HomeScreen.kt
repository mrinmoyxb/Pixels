package com.example.myapplication.View.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.myapplication.R
import com.example.myapplication.View.Components.DepositWithdrawCard
import com.example.myapplication.View.Components.Item
import com.example.myapplication.View.Components.SavingsHeading


@Composable
fun HomeScreen(navController: NavHostController){
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp
    val height: Int = 210

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(10.dp))
    {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

            SavingsHeading(height = height, width = ((screenWidth) / 2)+30, amount = "20000")

            Column(modifier = Modifier.height(height.dp), verticalArrangement = Arrangement.SpaceBetween){
                DepositWithdrawCard(text = "Deposit", icon = Icons.Filled.ArrowForward,
                    height = (height/2)-2, width = ((screenWidth - 90) / 2)-10,
                    boxColor = colorResource(id = R.color.secondary), fontSize = 20, navController, route = "earningsScreen")
                DepositWithdrawCard(text = "Withdraw", icon = Icons.Filled.ArrowBack,
                    height = (height/2)-2, width = ((screenWidth - 90) / 2)-10,
                    boxColor = colorResource(id = R.color.secondary), fontSize = 20, navController, route = "expensesScreen")
            }
        }
            LazyColumn {
                item {

                }
            }

        }
}