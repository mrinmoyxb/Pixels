package com.example.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.View.S3_DepositWithdrawScreen.AddEarningsScreen
import com.example.myapplication.View.S3_DepositWithdrawScreen.AddExpensesScreen
import com.example.myapplication.View.S1_HomeScreen.HomeScreen

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable(route = "homeScreen"){
            HomeScreen(navController)
        }
        composable(route = "expensesScreen"){
            AddExpensesScreen()
        }
        composable(route = "earningsScreen"){
            AddEarningsScreen()
        }
    }
}