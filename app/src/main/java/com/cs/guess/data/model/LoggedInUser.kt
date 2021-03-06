package com.cs.guess.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
@Entity
data class LoggedInUser(
    @PrimaryKey @ColumnInfo(name ="username") val username:String?,
    @ColumnInfo(name ="password") val password:String?
)