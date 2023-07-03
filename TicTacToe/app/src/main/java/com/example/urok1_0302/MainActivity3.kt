package com.example.urok1_0302

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    var board = MainActivity2()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val Knopka2 = findViewById<View>(R.id.exit2)
        Knopka2.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        val humanPc = findViewById<View>(R.id.button7)
        humanPc.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
