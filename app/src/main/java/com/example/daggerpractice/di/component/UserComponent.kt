package com.example.daggerpractice.di.component

import com.example.daggerpractice.MainActivity
import com.example.daggerpractice.di.module.DataBaseModule
import com.example.daggerpractice.di.module.NotificationModule
import dagger.Component

@Component (modules = [DataBaseModule::class,NotificationModule::class])
interface UserComponent {
    fun inject(activity: MainActivity)
}