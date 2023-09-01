package com.nofal.staytune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnNext = findViewById<Button>(R.id.button3)
        btnNext.setOnClickListener(){
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}