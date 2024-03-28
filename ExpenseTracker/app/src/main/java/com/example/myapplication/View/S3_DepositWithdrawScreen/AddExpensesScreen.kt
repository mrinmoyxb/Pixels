package com.example.myapplication.View.S3_DepositWithdrawScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.View.Components.CustomButton
import com.example.myapplication.View.Components.CustomDropDownMenu
import com.example.myapplication.View.Components.CustomTextInput
import com.example.myapplication.View.Components.Item
import com.example.myapplication.View.Components.TextHeading
import com.example.myapplication.ViewModel.AddAmountViewModel.AddAmountViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExpensesScreen(viewModel: AddAmountViewModel){

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

    // for input boxes
    var amount by remember{mutableStateOf("")}
    var description by remember{ mutableStateOf("")}

    // for drop down box
    var isExpanded by remember{mutableStateOf(false)}
    var expenseType by remember{ mutableStateOf("Select an expense type")}
    var iconToDisplay by remember { mutableIntStateOf(R.drawable.expenses) }

    // date
    val currentMillis = System.currentTimeMillis()
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val formattedDate = simpleDateFormat.format(remember { Calendar.getInstance().time })

    // Screen
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
            TextField(value = amount, onValueChange = {amount = it},
                placeholder = { Text("Enter the amount", fontSize =  20.sp, color = Color.Black, fontWeight = FontWeight.Light) },
                modifier = Modifier.fillMaxWidth().height(70.dp),
                shape = RoundedCornerShape(10.dp),
                textStyle = TextStyle(fontSize = 25.sp, color = Color.Black, fontWeight = FontWeight.SemiBold),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = colorResource(id = R.color.tertiary),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(10.dp))

            // Expense type drop down box:
            TextHeading(title = "Expense type", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(
                        color = colorResource(id = R.color.tertiary),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = { isExpanded = !isExpanded }) {

                    Row(modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp, end = 10.dp, top = 3.dp, bottom = 3.dp),
                        horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = iconToDisplay),
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                        TextField(
                            value = expenseType,
                            onValueChange = {},
                            modifier = Modifier
                                .menuAnchor()
                                .fillMaxSize(),
                            readOnly = true,
                            textStyle = TextStyle(fontSize = 23.sp, fontWeight = FontWeight.Light),
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color.Transparent,
                                cursorColor = Color.Black,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            )
                        )
                    }

                    ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                        options.forEach { item ->
                            DropdownMenuItem(
                                text = {
                                    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                                        Icon(painter = painterResource(id = item.icon), contentDescription = "", modifier = Modifier.size(15.dp))
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(item.name, fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                                    }
                                },

                                onClick = {
                                    expenseType = item.name
                                    iconToDisplay = item.icon
                                    isExpanded = false
                                }
                            )
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            // Enter description:
            TextHeading(title = "Description", fontSize = 23, fontWeight = FontWeight.SemiBold, color = Color.Black)
            TextField(value = description, onValueChange = {description = it},
                placeholder = {Text("Write a short description...", fontSize =  20.sp, color = Color.Black, fontWeight = FontWeight.Light)},
                modifier = Modifier.fillMaxWidth().height(70.dp),
                shape = RoundedCornerShape(10.dp),
                textStyle = TextStyle(fontSize = 25.sp, color = Color.Black, fontWeight = FontWeight.SemiBold),
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = colorResource(id = R.color.tertiary),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Save Button:
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .clickable { viewModel.addExpenseTransaction(amount = amount.toDouble(), type = expenseType, description = description,
                    formattedDate = formattedDate, dateAddedInMillis = currentMillis)}
                .background(Color.Transparent),
                shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(colorResource(id = R.color.primary))){
                Box(modifier = Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.Center){
                    Text("Add as expense", color = Color.White, fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}