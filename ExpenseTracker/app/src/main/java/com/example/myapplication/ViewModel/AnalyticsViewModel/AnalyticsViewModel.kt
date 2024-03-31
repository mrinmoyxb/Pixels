package com.example.myapplication.ViewModel.AnalyticsViewModel

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.myapplication.Model.Database.FinanceTable
import com.example.myapplication.Model.Database.FinanceTableDao
import kotlinx.coroutines.flow.Flow

class AnalyticsViewModel(private val financeDao: FinanceTableDao): ViewModel() {
    var getEarnings: Flow<Double> = financeDao.getTotalEarnings()
    var getExpenses: Flow<Double> = financeDao.getTotalExpenses()
    var getMaxExpense: Flow<Double> = financeDao.getMaxExpenditure()
}

