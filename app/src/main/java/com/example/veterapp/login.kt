package com.example.veterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<ImageView>(R.id.bienvenida).setOnClickListener { back() }

        findViewById<Button>(R.id.resetCount).setOnClickListener { resetCount() }

        findViewById<Button>(R.id.login).setOnClickListener { loguear() }
    }

    fun resetCount (){
        val resetCount = Intent(this, ResetPasword::class.java)
        startActivity(resetCount)
    }

    fun back(){
        val resetback = Intent(this, MainActivity::class.java)
        startActivity(resetback)
    }

    fun loguear(){
        val loguear = Intent(this, Beginning::class.java)
        startActivity(loguear)
    }
}