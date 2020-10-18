package com.chess.madlevel4example

import androidx.room.*

@Entity(tableName = "reminderTable")
class Reminder(

    @ColumnInfo(name = "reminder")
    var reminderText: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)