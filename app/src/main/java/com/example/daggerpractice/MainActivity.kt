package com.example.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerpractice.di.component.DaggerUserComponent
import com.example.daggerpractice.repository.UserRegistrationRepository
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRep: UserRegistrationRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerUserComponent.builder().build()
        component.inject(this)
        userRep.userRegister("piyushd068@gmail.com","1232456")
    }
}