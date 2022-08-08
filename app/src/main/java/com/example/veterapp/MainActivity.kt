package com.example.veterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login).setOnClickListener { nextLogin() }
        findViewById<Button>(R.id.register).setOnClickListener { nextRegister() }
    }

    fun nextLogin(){
        val viewLogin = Intent(this, login::class.java)
        startActivity(viewLogin)
    }

    fun nextRegister(){
        val viewLogin = Intent(this, Register::class.java)
        startActivity(viewLogin)
    }

}