package com.example.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.View.DepositWithdrawScreen.AddExpensesScreen
import com.example.myapplication.View.HomeScreen.HomeScreen

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
    }
}