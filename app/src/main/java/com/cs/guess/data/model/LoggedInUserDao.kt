package com.cs.guess.data.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM LoggedInUser")
    fun getAll(): List<LoggedInUser>

//    @Query("SELECT * FROM LoggedInUser WHERE username IN (:userNames)")
    @Query("SELECT * FROM LoggedInUser WHERE username LIKE :search")
    fun searchByUsername(search:String): List<LoggedInUser>

//    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): User
//
//    @Insert
//    fun insertAll(vararg users: User)
//
//    @Delete
//    fun delete(user: User)
}