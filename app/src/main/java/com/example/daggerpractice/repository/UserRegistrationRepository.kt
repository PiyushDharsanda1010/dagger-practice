package com.example.daggerpractice.repository

import com.example.daggerpractice.di.annotaion.NotificationAnnotation
import com.example.daggerpractice.service.saveDataBaseService
import com.example.daggerpractice.service.sendNotificationService
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationRepository @Inject constructor(
    @NotificationAnnotation private val notificationService: sendNotificationService,
    @Named("sqlite") private val saveDataBaseService: saveDataBaseService
){
    fun userRegister(email :String,password : String){
        notificationService.sendNotification(email)
        saveDataBaseService.saveData(email, password)
    }
}