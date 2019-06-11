package com.example.footballapp.data.model.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "users")
class User {

    @PrimaryKey
    var id: Long? = null

    var userId: String? = null
    var userName: String? = null
    var userPassword: String? = null
    var userIdKey: String? = null

    @ColumnInfo(name = "created_at")
    var createdAt: String? = null

    @ColumnInfo(name = "updated_at")
    var updatedAt: String? = null
}
