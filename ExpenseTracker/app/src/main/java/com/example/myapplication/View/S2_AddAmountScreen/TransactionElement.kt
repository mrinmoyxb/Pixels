package com.example.myapplication.View.S2_AddAmountScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.Model.Database.FinanceTable
import com.example.myapplication.Model.TextConstants
import com.example.myapplication.R
import com.example.myapplication.View.Components.Item
import com.example.myapplication.ViewModel.AddAmountViewModel.AddAmountViewModel

@Composable
fun TransactionElement(transactionsList: List<FinanceTable>, viewModel: AddAmountViewModel) {

    Column {
        transactionsList.forEach {transaction ->
            val transactionSymbol: String = when (transaction.isEarnings) {
                1 -> "+"
                0 -> "-"
                else -> ""
            }

            val transactionIcon: Int = when (transaction.type) {
                "Business Profits" -> R.drawable.profit
                "Capital Gains" -> R.drawable.gain
                "Commissions" -> R.drawable.commissions
                "Dividends" -> R.drawable.dividends
                "Interests" -> R.drawable.interest
                "Salary" -> R.drawable.salary
                "Wages" -> R.drawable.wages
                "Others" -> R.drawable.others
                "Bills" -> R.drawable.bills
                "Debt" -> R.drawable.debt
                "Entertainment" -> R.drawable.entertainment
                "Food" -> R.drawable.soup
                "Health Insurance" -> R.drawable.health
                "Housing" -> R.drawable.home
                "Personal Care" -> R.drawable.personal
                "Shopping" -> R.drawable.shopping
                "Transportation" -> R.drawable.plane
                "Utilities" -> R.drawable.utilities
                else -> {
                    0
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Transparent),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(colorResource(id = R.color.secondary))
            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        item {

                            // Icon
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Box(
                                    modifier = Modifier.clip(CircleShape).size(65.dp)
                                        .background(Color.White).padding(12.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        painter = painterResource(id = transactionIcon),
                                        contentDescription = ""
                                    )
                                }

                            }
                            Spacer(modifier = Modifier.width(12.dp))

                            // Transaction Type and Date of Transaction
                            Column(
                                modifier = Modifier.width(190.dp).fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    transaction.type,
                                    fontSize = TextConstants.TransactionHeading.size.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                                Text(transaction.formattedDate, color = Color.White)
                            }
                            Spacer(modifier = Modifier.width(8.dp))

                            // Amount
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            )
                            {
                                Row() {
                                    Text(
                                        "$transactionSymbol ",
                                        fontSize = TextConstants.Amount.size.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = Color.Green
                                    )
                                    Text(
                                        transaction.amount.toString(),
                                        fontSize = TextConstants.Amount.size.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                }


            }
        }
    }
}