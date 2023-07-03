package com.example.urok1_0302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val Knopka2 = findViewById<View>(R.id.button5)
        Knopka2.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        val humanPc = findViewById<View>(R.id.button6)
        humanPc.setOnClickListener {
            val intent = Intent(this@MainActivity7, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}