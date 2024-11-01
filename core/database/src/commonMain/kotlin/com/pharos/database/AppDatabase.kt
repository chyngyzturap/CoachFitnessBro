package com.pharos.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pharos.database.table.user.UserDao
import com.pharos.database.table.user.UserEntity

@Database(
    entities = [
        UserEntity::class,
    ],
    version = DATABASE_VERSION
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
private const val DATABASE_VERSION = 1
