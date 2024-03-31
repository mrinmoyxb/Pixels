package com.example.myapplication.View.S2_AddAmountScreen

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.Model.Database.FinanceTable
import com.example.myapplication.Model.TextConstants
import com.example.myapplication.R
import com.example.myapplication.View.Components.DepositWithdrawCard
import com.example.myapplication.View.Components.TextHeading
import com.example.myapplication.View.Components.TransactionElements
import com.example.myapplication.ViewModel.AddAmountViewModel.AddAmountViewModel
import kotlinx.coroutines.flow.Flow

@Composable
fun AddAmountScreen(navHostController: NavHostController, viewModel: AddAmountViewModel){
    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp
    val height: Int = 210

    val transactionList = viewModel.getAllTransactionsByDate.collectAsState(initial = emptyList())
    var lastTenTransactions = viewModel.getLastTenTransactions.collectAsState(initial = emptyList())

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.black_primary))
        .padding(10.dp)){

        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            // Heading
            TextHeading(
                title = "Add", fontSize = TextConstants.Heading.size,
                fontWeight = FontWeight.Bold, color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){

                // Earnings
                DepositWithdrawCard(text = "Earnings", icon = painterResource(id = R.drawable.downward_arrow),
                    height = (height/2)-2, width = ((screenWidth)/ 2)-12,
                    boxColor = colorResource(id = R.color.green_tertiary), fontSize = 25, navHostController = navHostController, route = "earningsScreen")

                // Expenses
                DepositWithdrawCard(text = "Expenses", icon = painterResource(id = R.drawable.upward_arrow),
                    height = (height/2)-2, width = ((screenWidth)/ 2)-12,
                    boxColor = colorResource(id = R.color.purple_secondary), fontSize = 25, navHostController = navHostController, route = "expensesScreen")
            }
        Spacer(modifier = Modifier.height(15.dp))

        // Sub Heading
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            TextHeading(
                title = "Last 10 Transactions", fontSize = TextConstants.SubHeading.size,
                fontWeight = FontWeight.Normal, color = Color.White
            )
            TextHeading(
                title = "VIEW ALL", fontSize = TextConstants.SubHeading.size,
                fontWeight = FontWeight.SemiBold, color = Color.White
            )

//            Text("Earnings", fontSize = TextConstants.Heading.size.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
//            Text("Expenses", fontSize = TextConstants.Heading.size.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
        }
        Spacer(modifier = Modifier.height(5.dp))

        LazyColumn(modifier = Modifier.fillMaxSize()){
            item{
                TransactionElements(transactionsList = lastTenTransactions.value)
            }
            
        }

    }

}