package com.cs.guess.data.model

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


@Database(entities = arrayOf(LoggedInUser::class),version=1)
abstract class LoggedInUserDatabase:RoomDatabase() {
    companion object{
        val instance:LoggedInUserDatabase by lazy {
            Room.databaseBuilder(Application().applicationContext
                ,LoggedInUserDatabase::class.java
                ,"logged_user.db")
                .build()
        }
    }

    abstract fun userDao():UserDao
}