package com.example.urok1_0302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.logging.Logger.global

class MainActivity5 : AppCompatActivity() {
    var step = arrayOf("X", "0")
    var stepN = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val VtoroiKnopka = findViewById<View>(R.id.exit1)

        val tik1 = findViewById<Button>(R.id.b1)
        val tik2 = findViewById<Button>(R.id.b2)
        val tik3 = findViewById<Button>(R.id.b3)
        val tik4 = findViewById<Button>(R.id.b4)
        val tik5 = findViewById<Button>(R.id.b5)
        val tik6 = findViewById<Button>(R.id.b6)
        val tik7 = findViewById<Button>(R.id.b7)
        val tik8 = findViewById<Button>(R.id.b8)
        val tik9 = findViewById<Button>(R.id.b9)

        VtoroiKnopka.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        fun draw() {
            if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                tik9.text !== "") {
                val intent = Intent(this@MainActivity5, MainActivity7::class.java)
                startActivity(intent)
            }
        }

        fun winX() {
            val intent = Intent(this@MainActivity5, MainActivity3::class.java)
            startActivity(intent)
        }

        fun winO() {
            val intent = Intent(this@MainActivity5, MainActivity6::class.java)
            startActivity(intent)
        }

        fun gameOver() {
            if (tik1.text !== "" && tik1.text == tik2.text && tik2.text == tik3.text) {
                if (tik1.text == "X") {
                    winX()
                } else if (tik1.text == "0") {
                    winO()
                }
            } else if (tik4.text !== "" && tik4.text == tik5.text && tik5.text == tik6.text) {
                if (tik4.text == "X") {
                    winX()
                } else if (tik4.text == "0") {
                    winO()
                }
            } else if (tik7.text !== "" && tik7.text == tik8.text && tik8.text == tik9.text) {
                if (tik7.text == "X") {
                    winX()
                } else if (tik7.text == "0") {
                    winO()
                }
            } else if (tik1.text !== "" && tik1.text == tik4.text && tik4.text == tik7.text) {
                if (tik1.text == "X") {
                    winX()
                } else if (tik1.text == "0") {
                    winO()
                }
            } else if (tik3.text !== "" && tik3.text == tik6.text && tik6.text == tik9.text) {
                if (tik3.text == "X") {
                    winX()
                } else if (tik3.text == "0") {
                    winO()
                }
            } else if (tik1.text !== "" && tik1.text == tik5.text && tik5.text == tik9.text) {
                if (tik1.text == "X") {
                    winX()
                } else if (tik1.text == "0") {
                    winO()
                }
            } else if (tik3.text !== "" && tik3.text == tik5.text && tik5.text == tik7.text) {
                if (tik3.text == "X") {
                    winX()
                } else if (tik3.text == "0") {
                    winO()
                }
            }else if (tik2.text !== "" && tik2.text == tik5.text && tik5.text == tik8.text) {
                if (tik2.text == "X") {
                    winX()
                } else if (tik2.text == "0") {
                    winO()
                }
            }
            else draw()

        }
        fun random() {
            val tok = (1 until 10).random()
            when (tok) {
                1 -> {
                    if (tik1.text == "") {
                        tik1.setText(step[stepN])
                        stepN = 1 - stepN
                        tik1.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik1.text !== "") {
                        return random()
                    }
                }
                2 -> {
                    if (tik2.text == "") {
                        tik2.setText(step[stepN])
                        stepN = 1 - stepN
                        tik2.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik2.text !== "") {
                        return random()
                    }
                }
                3 -> {
                    if (tik3.text == "") {
                        tik3.setText(step[stepN])
                        stepN = 1 - stepN
                        tik3.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik3.text !== "") {
                        return random()
                    }
                }
                4 -> {
                    if (tik4.text == "") {
                        tik4.setText(step[stepN])
                        stepN = 1 - stepN
                        tik4.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik4.text !== "") {
                        return random()
                    }
                }
                5 -> {
                    if (tik5.text == "") {
                        tik5.setText(step[stepN])
                        stepN = 1 - stepN
                        tik5.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik5.text !== "") {
                        return random()
                    }
                }
                6 -> {
                    if (tik6.text == "") {
                        tik6.setText(step[stepN])
                        stepN = 1 - stepN
                        tik6.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik6.text !== "") {
                        return random()
                    }
                }
                7 -> {
                    if (tik7.text == "") {
                        tik7.setText(step[stepN])
                        stepN = 1 - stepN
                        tik7.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik7.text !== "") {
                        return random()
                    }
                }

                8 -> {
                    if (tik8.text == "") {
                        tik8.setText(step[stepN])
                        stepN = 1 - stepN
                        tik8.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik8.text !== "") {
                        return random()
                    }
                }
                9 -> {
                    if (tik9.text == "") {
                        tik9.setText(step[stepN])
                        stepN = 1 - stepN
                        tik9.isEnabled = false
                        gameOver()
                    }
                    else if (tik1.text !== "" && tik2.text !== "" && tik3.text !== "" && tik4.text !== "" &&
                        tik5.text !== "" && tik6.text !== "" && tik7.text !== "" && tik8.text !== "" &&
                        tik9.text !== ""){
                        gameOver()
                    }
                    else if (tik9.text !== "") {
                        return random()
                    }
                }
            }
        }
        tik1.setOnClickListener {
            if (tik1.text == "") {
                tik1.setText(step[stepN])
                stepN = 1 - stepN
                tik1.isEnabled = false
                gameOver()
            }
            if (tik1.text == "X" && tik2.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()

                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik1.text == "X" && tik3.text == "X") {
                if (tik2.text == "") {
                    tik2.setText(step[stepN])
                    stepN = 1 - stepN
                    tik2.isEnabled = false
                    gameOver()
                } else if (tik2.text == "0") {
                    random()
                }
            } else if (tik1.text == "X" && tik4.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()
                }
            } else if (tik1.text == "X" && tik7.text == "X") {
                if (tik4.text == "") {
                    tik4.setText(step[stepN])
                    stepN = 1 - stepN
                    tik4.isEnabled = false
                    gameOver()
                } else if (tik4.text == "0") {
                    random()
                }
            } else if (tik1.text == "X" && tik9.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else if (tik1.text == "X" && tik5.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik2.setOnClickListener {
            if (tik2.text == "") {
                tik2.setText(step[stepN])
                stepN = 1 - stepN
                tik2.isEnabled = false
                gameOver()
            }
            if (tik2.text == "X" && tik3.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            } else if (tik2.text == "X" && tik1.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()
                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik2.text == "X" && tik5.text == "X") {
                if (tik8.text == "") {
                    tik8.setText(step[stepN])
                    stepN = 1 - stepN
                    tik8.isEnabled = false
                    gameOver()
                } else if (tik8.text == "0") {
                    random()
                }
            } else if (tik2.text == "X" && tik8.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik3.setOnClickListener {
            if (tik3.text == "") {
                tik3.setText(step[stepN])
                stepN = 1 - stepN
                tik3.isEnabled = false
                gameOver()
            }
            if (tik3.text == "X" && tik2.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            } else if (tik3.text == "X" && tik1.text == "X") {
                if (tik2.text == "") {
                    tik2.setText(step[stepN])
                    stepN = 1 - stepN
                    tik2.isEnabled = false
                    gameOver()
                } else if (tik2.text == "0") {
                    random()
                }
            } else if (tik3.text == "X" && tik6.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text == "0") {
                    random()
                }
            } else if (tik3.text == "X" && tik9.text == "X") {
                if (tik6.text == "") {
                    tik6.setText(step[stepN])
                    stepN = 1 - stepN
                    tik6.isEnabled = false
                    gameOver()
                } else if (tik6.text == "0") {
                    random()
                }
            } else if (tik3.text == "X" && tik5.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()

                }
            } else if (tik3.text == "X" && tik7.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik4.setOnClickListener {
            if (tik4.text == "") {
                tik4.setText(step[stepN])
                stepN = 1 - stepN
                tik4.isEnabled = false
                gameOver()
            }
            if (tik4.text == "X" && tik5.text == "X") {
                if (tik6.text == "") {
                    tik6.setText(step[stepN])
                    stepN = 1 - stepN
                    tik6.isEnabled = false
                    gameOver()
                } else if (tik6.text == "0") {
                    random()
                }
            } else if (tik4.text == "X" && tik7.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            } else if (tik4.text == "X" && tik1.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()
                }
            } else if (tik4.text == "X" && tik6.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik5.setOnClickListener {
            if (tik5.text == "") {
                tik5.setText(step[stepN])
                stepN = 1 - stepN
                tik5.isEnabled = false
                gameOver()
            }
            if (tik5.text == "X" && tik9.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            }
            else if (tik5.text == "X" && tik8.text == "x") {
                if (tik2.text == "") {
                    tik2.setText(step[stepN])
                    stepN = 1 - stepN
                    tik2.isEnabled = false
                    gameOver()
                } else if (tik2.text == "0") {
                    random()
                }
            } else if (tik5.text == "X" && tik7.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()
                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik5.text == "X" && tik6.text == "X") {
                if (tik4.text == "") {
                    tik4.setText(step[stepN])
                    stepN = 1 - stepN
                    tik4.isEnabled = false
                    gameOver()
                } else if (tik4.text == "0") {
                    random()
                }
            } else if (tik5.text == "X" && tik4.text == "X") {
                if (tik6.text == "") {
                    tik6.setText(step[stepN])
                    stepN = 1 - stepN
                    tik6.isEnabled = false
                    gameOver()
                } else if (tik6.text == "0") {
                    random()
                }
            } else if (tik5.text == "X" && tik3.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()

                }
            } else if (tik5.text == "X" && tik2.text == "X") {
                if (tik8.text == "") {
                    tik8.setText(step[stepN])
                    stepN = 1 - stepN
                    tik8.isEnabled = false
                    gameOver()
                } else if (tik8.text == "0") {
                    random()
                }
            } else if (tik5.text == "X" && tik1.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik6.setOnClickListener {
            if (tik6.text == "") {
                tik6.setText(step[stepN])
                stepN = 1 - stepN
                tik6.isEnabled = false
                gameOver()
            }
            if (tik6.text == "X" && tik3.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text == "0") {
                    random()
                }
            } else if (tik6.text == "X" && tik9.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()
                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik6.text == "X" && tik5.text == "X") {
                if (tik4.text == "") {
                    tik4.setText(step[stepN])
                    stepN = 1 - stepN
                    tik4.isEnabled = false
                    gameOver()
                } else if (tik4.text == "0") {
                    random()
                }
            } else if (tik6.text == "X" && tik4.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik7.setOnClickListener {
            if (tik7.text == "") {
                tik7.setText(step[stepN])
                stepN = 1 - stepN
                tik7.isEnabled = false
                gameOver()
            }
            if (tik7.text == "X" && tik5.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()
                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik7.text == "X" && tik1.text == "X") {
                if (tik4.text == "") {
                    tik4.setText(step[stepN])
                    stepN = 1 - stepN
                    tik4.isEnabled = false
                    gameOver()
                } else if (tik4.text == "0") {
                    random()
                }
            } else if (tik7.text == "X" && tik8.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text !== "") {
                    random()
                }
            } else if (tik7.text == "X" && tik9.text == "X") {
                if (tik8.text == "") {
                    tik8.setText(step[stepN])
                    stepN = 1 - stepN
                    tik8.isEnabled = false
                    gameOver()
                } else if (tik8.text == "0") {
                    random()
                }
            } else if (tik7.text == "X" && tik3.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else if (tik7.text == "X" && tik4.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik8.setOnClickListener {
            if (tik8.text == "") {
                tik8.setText(step[stepN])
                stepN = 1 - stepN
                tik8.isEnabled = false
                gameOver()
            }
            if (tik8.text == "X" && tik5.text == "X") {
                if (tik2.text == "") {
                    tik2.setText(step[stepN])
                    stepN = 1 - stepN
                    tik2.isEnabled = false
                    gameOver()
                } else if (tik2.text == "0") {
                    random()
                }
            } else if (tik8.text == "X" && tik9.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()
                }
            } else if (tik8.text == "X" && tik7.text == "X") {
                if (tik9.text == "") {
                    tik9.setText(step[stepN])
                    stepN = 1 - stepN
                    tik9.isEnabled = false
                    gameOver()
                } else if (tik9.text == "0") {
                    random()
                }
            } else if (tik8.text == "X" && tik2.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik8.text == "0") {
                    random()
                }
            } else {
                random()
            }
        }
        tik9.setOnClickListener {
            if (tik9.text == "") {
                tik9.setText(step[stepN])
                stepN = 1 - stepN
                tik9.isEnabled = false
                gameOver()
            }
            if (tik9.text == "X" && tik5.text == "X") {
                if (tik1.text == "") {
                    tik1.setText(step[stepN])
                    stepN = 1 - stepN
                    tik1.isEnabled = false
                    gameOver()
                } else if (tik1.text == "0") {
                    random()
                }
            } else if (tik9.text == "X" && tik1.text == "X") {
                if (tik5.text == "") {
                    tik5.setText(step[stepN])
                    stepN = 1 - stepN
                    tik5.isEnabled = false
                    gameOver()
                } else if (tik5.text == "0") {
                    random()
                }
            } else if (tik9.text == "X" && tik8.text == "X") {
                if (tik7.text == "") {
                    tik7.setText(step[stepN])
                    stepN = 1 - stepN
                    tik7.isEnabled = false
                    gameOver()
                } else if (tik7.text == "0") {
                    random()
                }
            } else if (tik9.text == "X" && tik7.text == "X") {
                if (tik8.text == "") {
                    tik8.setText(step[stepN])
                    stepN = 1 - stepN
                    tik8.isEnabled = false
                    gameOver()
                } else if (tik8.text == "0") {
                    random()
                }
            } else if (tik9.text == "X" && tik6.text == "X") {
                if (tik3.text == "") {
                    tik3.setText(step[stepN])
                    stepN = 1 - stepN
                    tik3.isEnabled = false
                    gameOver()
                } else if (tik3.text == "0") {
                    random()
                }
            } else if (tik9.text == "X" && tik3.text == "X") {
                if (tik6.text == "") {
                    tik6.setText(step[stepN])
                    stepN = 1 - stepN
                    tik6.isEnabled = false
                    gameOver()
                } else if (tik6.text == "0") {
                    random()
                }
            } else {
                random()

            }
        }
    }
}