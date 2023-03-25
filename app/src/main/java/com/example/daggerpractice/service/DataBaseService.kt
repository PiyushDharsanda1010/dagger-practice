package com.example.daggerpractice.service

import android.util.Log
import javax.inject.Inject

interface saveDataBaseService{
    fun saveData(email : String,password: String)
}
class FirebaseService  @Inject constructor(): saveDataBaseService{
    companion object{
        private const val TAG = "FirebaseService"
    }
    override fun saveData(email : String,password: String){
        Log.e(TAG,"saveData to Firebase $email")
    }
}
class SqliteService  @Inject constructor(): saveDataBaseService{
    companion object{
        private const val TAG = "SqliteService"
    }
    override fun saveData(email : String,password: String){
        Log.e(TAG,"Save data Sqlite to $email")
    }
}