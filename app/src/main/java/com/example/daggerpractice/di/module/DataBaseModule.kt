package com.example.daggerpractice.di.module

import com.example.daggerpractice.service.FirebaseService
import com.example.daggerpractice.service.SqliteService
import com.example.daggerpractice.service.saveDataBaseService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class DataBaseModule {

    @Named("firebase")
    @Provides
    fun getFirebaseDatabase(sqliteService: FirebaseService) : saveDataBaseService{
      return sqliteService
    }

    @Named("sqlite")
    @Provides
    fun getSqlDataBase(sqliteService: SqliteService) : saveDataBaseService{
      return sqliteService
    }
}