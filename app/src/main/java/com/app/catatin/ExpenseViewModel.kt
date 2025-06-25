package com.app.catatin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.catatin.local.Expense
import com.app.catatin.local.ExpenseDao
import kotlinx.coroutines.launch


class ExpenseViewModel(
    private val expenseDao: ExpenseDao
) : ViewModel() {

    fun insertExpense(expense: Expense) {
       viewModelScope.launch {
            expenseDao.insertExpense(expense)
        }
    }
    fun updateExpense(expense: Expense) {
        viewModelScope.launch {
            expenseDao.updateExpense(expense)
        }
    }

    fun deleteExpense(expense: Expense) {
        viewModelScope.launch {
            expenseDao.deleteExpense(expense)
        }
    }
    fun getAllExpenses() = expenseDao.getAllExpenses()

}