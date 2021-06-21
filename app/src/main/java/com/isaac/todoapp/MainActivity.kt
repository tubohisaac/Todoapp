package com.isaac.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val username:String = " Admin"
    val password:String =" Admin"
    private lateinit var usernameInput:EditText
    private lateinit var passwordInput:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}