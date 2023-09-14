package com.example.roomdatabase.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "UserTable")
class UserEntitiy (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name : String,
    val lastName: String,
    val Age: Int
        ):Parcelable
