package com.app.catatin.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ExpenseDao {

    @Insert
     fun insertExpense(expense: Expense)

    @Update
     fun updateExpense(expense: Expense)

    @Delete
     fun deleteExpense(expense: Expense)

    @Query("SELECT * FROM expenses ORDER BY date ASC")
     fun getAllExpenses(): LiveData<List<Expense>>
}