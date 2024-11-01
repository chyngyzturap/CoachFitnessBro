package com.pharos.database

import com.pharos.database.table.user.UserDao


val databaseModule
    get() = platformDatabaseModule(fileName = "database.db")
        .apply {
            single<UserDao> { get<AppDatabase>().userDao() }
        }
