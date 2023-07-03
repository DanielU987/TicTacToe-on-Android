package com.example.urok1_0302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val MoiKnopka =findViewById<View>(R.id.playplayer)
        MoiKnopka.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        val Knopka1 =findViewById<View>(R.id.Exit1)
        Knopka1.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        val humanPc =findViewById<View>(R.id.playpc)
        humanPc.setOnClickListener{
            val intent= Intent(this@MainActivity, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
    }
}