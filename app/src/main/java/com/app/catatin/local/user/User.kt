package com.app.catatin.local.user

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val profilePicture: String? = null,
    val confirmPassword: String? = null,

)
