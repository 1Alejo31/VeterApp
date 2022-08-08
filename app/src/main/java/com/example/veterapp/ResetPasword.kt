package com.example.veterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResetPasword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pasword)

        findViewById<ImageView>(R.id.loginR).setOnClickListener { restLogin() }

    }

    fun restLogin(){
        val resetLogin = Intent(this, login::class.java)
        startActivity(resetLogin)
    }
}