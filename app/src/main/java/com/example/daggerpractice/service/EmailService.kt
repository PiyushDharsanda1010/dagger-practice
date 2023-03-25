package com.example.daggerpractice.service

import android.util.Log
import javax.inject.Inject

interface sendNotificationService{
    fun sendNotification(email : String)
}
class EmailService @Inject constructor() : sendNotificationService{
    companion object{
        private const val TAG = "EmailService"
    }
    override fun sendNotification(email : String){
        Log.e(TAG,"Send Email to $email")
    }
}
class MessageService @Inject constructor(): sendNotificationService{
    companion object{
        private const val TAG = "MessageService"
    }
    override fun sendNotification(email : String){
        Log.e(TAG,"Send Email to message $email")
    }
}