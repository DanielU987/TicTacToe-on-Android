package com.example.urok1_0302

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.system.exitProcess

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val Knopka4 =findViewById<View>(R.id.button4)
        Knopka4.setOnClickListener{
            val intent= Intent(this@MainActivity4, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val Knopka5 =findViewById<View>(R.id.exit)
        Knopka5.setOnClickListener{
            finishAffinity()
        }
    }
}