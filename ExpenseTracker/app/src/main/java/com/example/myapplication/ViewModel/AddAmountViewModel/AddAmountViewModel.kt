package com.example.myapplication.ViewModel.AddAmountViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.Model.Database.FinanceTable
import com.example.myapplication.Model.Database.FinanceTableDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import java.sql.Date


class AddAmountViewModel(private val financeDao: FinanceTableDao): ViewModel() {

    fun addEarningTransaction(amount: Double, type: String, description: String, dateAdded: Date){
        viewModelScope.launch{
            financeDao.insertAmount(FinanceTable(amount = amount,type = type, description = description, isEarnings = 1, dateAdded = dateAdded))
        }
    }

    fun addExpenseTransaction(amount: Double, type: String, description: String, dateAdded: Date){
        viewModelScope.launch {
            financeDao.insertAmount(FinanceTable(amount = amount, type = type, description = description, isEarnings = 0, dateAdded = dateAdded))
        }
    }

    var getAllTransactions: Flow<List<FinanceTable>> = financeDao.getAllTransactions()

}