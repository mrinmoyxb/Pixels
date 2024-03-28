package com.example.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Model.Database.TransactionDatabase
import com.example.myapplication.View.S3_DepositWithdrawScreen.AddEarningsScreen
import com.example.myapplication.View.S3_DepositWithdrawScreen.AddExpensesScreen
import com.example.myapplication.View.S1_HomeScreen.HomeScreen
import com.example.myapplication.View.S2_AddAmountScreen.AddAmountScreen
import com.example.myapplication.ViewModel.AddAmountViewModel.AddAmountViewModel

@Composable
fun MainScreen(){
    val context =  LocalContext.current
    val viewModel = AddAmountViewModel(TransactionDatabase.getInstance(context).financeDao())
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable(route = "homeScreen"){
            HomeScreen(navController)
        }

        // Inherited Screens:
        composable(route = "expensesScreen"){
            AddExpensesScreen(viewModel)
        }
        composable(route = "earningsScreen"){
            AddEarningsScreen(viewModel)
        }

        // Screen 3:
        composable(route = "addAmountScreen"){
            AddAmountScreen(navController)
        }
    }
}