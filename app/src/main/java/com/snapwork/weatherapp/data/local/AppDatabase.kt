package com.snapwork.weatherapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.snapwork.weatherapp.data.local.dao.UserDao
import com.snapwork.weatherapp.data.local.entity.UserEntity

@Database(
    entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

}
