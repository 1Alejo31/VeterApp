package com.example.veterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<ImageView>(R.id.backBienvenido).setOnClickListener { backR() }
    }

    fun backR(){
        val resetback = Intent(this, MainActivity::class.java)
        startActivity(resetback)
    }
}