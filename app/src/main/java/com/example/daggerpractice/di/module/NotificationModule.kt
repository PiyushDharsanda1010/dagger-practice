package com.example.daggerpractice.di.module


import com.example.daggerpractice.di.annotaion.NotificationAnnotation
import com.example.daggerpractice.service.EmailService
import com.example.daggerpractice.service.MessageService
import com.example.daggerpractice.service.sendNotificationService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class NotificationModule {

    @Named("emailNotification")
    @Binds
    abstract fun emailService(messageService: EmailService) : sendNotificationService

    @NotificationAnnotation
    @Binds
    abstract fun messageService(messageService: MessageService) : sendNotificationService
}