package com.example.helloui

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // hubungkan logic ke UI
        val rootLayout = findViewById<LinearLayout>(R.id.rootLayout)
        val input = findViewById<EditText>(R.id.myInput)
        val greetBtn = findViewById<Button>(R.id.myButton)
        val output = findViewById<TextView>(R.id.myOutput)
        val themeBtn = findViewById<Button>(R.id.btnTheme)

        var isDarkMode = false


        greetBtn.setOnClickListener {
            output.text = "Hello " + input.text.toString()
        }

        themeBtn.setOnClickListener {
            if (isDarkMode) {
                rootLayout.setBackgroundColor(Color.WHITE)
                output.setTextColor(Color.BLACK)
                input.setTextColor(Color.BLACK)
                themeBtn.text = "Mode Gelap"
                isDarkMode = false
            } else {
                rootLayout.setBackgroundColor(Color.BLACK)
                output.setTextColor(Color.WHITE)
                input.setTextColor(Color.BLACK)
                themeBtn.text = "Mode Terang"
                isDarkMode = true
            }
        }
    }
}