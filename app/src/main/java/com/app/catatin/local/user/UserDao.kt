package com.app.catatin.local.user

import androidx.room.Insert
import androidx.room.Query

interface UserDao {

    @Insert
    fun registerUser(user: User)

    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    fun login(email: String, password: String): User
}