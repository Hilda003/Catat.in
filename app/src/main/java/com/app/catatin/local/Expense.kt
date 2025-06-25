package com.app.catatin.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey (autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val amount: Double,
    val date: Long, // Timestamp in milliseconds
    val category: String,
    val description: String?
)
