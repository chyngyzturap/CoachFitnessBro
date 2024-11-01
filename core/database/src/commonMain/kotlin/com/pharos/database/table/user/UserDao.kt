package com.pharos.database.table.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(entity: UserEntity)

    @Query("SELECT * FROM UserEntity")
    suspend fun get(): List<UserEntity>

    @Query("SELECT * FROM UserEntity")
    fun observe(): Flow<List<UserEntity>>
}
