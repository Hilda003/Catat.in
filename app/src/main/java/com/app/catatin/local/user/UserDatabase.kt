package com.app.catatin.local.user

import androidx.room.Database


@Database(entities = [User::class], version = 1)
abstract class UserDatabase {

    abstract fun userDao(): UserDao


    companion object {
        @Volatile private var INSTANCE: UserDatabase? = null
    }
    fun getDatabase(): UserDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = UserDatabase::class.java.newInstance()
            INSTANCE = instance
            instance
        }
    }


}