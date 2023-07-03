package com.example.urok1_0302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val Knopka2 = findViewById<View>(R.id.button)
        Knopka2.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        val humanPc = findViewById<View>(R.id.button3)
        humanPc.setOnClickListener {
            val intent = Intent(this@MainActivity6, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}