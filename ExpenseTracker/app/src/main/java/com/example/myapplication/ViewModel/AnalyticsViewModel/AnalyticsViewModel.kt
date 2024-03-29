package com.example.myapplication.ViewModel.AnalyticsViewModel

import androidx.lifecycle.ViewModel
import com.example.myapplication.Model.Database.FinanceTable
import com.example.myapplication.Model.Database.FinanceTableDao
import kotlinx.coroutines.flow.Flow

class AnalyticsViewModel(private val financeDao: FinanceTableDao): ViewModel() {
    var getEarnings: Flow<List<FinanceTable>> = financeDao.getAllEarnings()
    var getExpenses: Flow<List<FinanceTable>> = financeDao.getAllExpenses()
}