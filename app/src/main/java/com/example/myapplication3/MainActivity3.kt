package com.example.myapplication3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    private var Num1: EditText? = null
    private var Num2: EditText? = null
    private var button: Button? = null
    private var button2: Button? = null
    private var button3: Button? = null
    private var btn4: Button? = null
    private var result: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Num1 = findViewById<View>(R.id.Num1) as EditText
        Num2 = findViewById<View>(R.id.Num2) as EditText
        button = findViewById<View>(R.id.button) as Button
        button2 = findViewById<View>(R.id.button2) as Button
        button3 = findViewById<View>(R.id.button3) as Button
        btn4 = findViewById<View>(R.id.btn4) as Button
        result = findViewById<View>(R.id.result) as TextView
        button!!.setOnClickListener {
            val number1 = Num1!!.text.toString().toInt()
            val number2 = Num2!!.text.toString().toInt()
            val sum = number1 + number2
            result!!.text = "Answer $sum"
        }
        button2!!.setOnClickListener {
            val number1 = Num1!!.text.toString().toInt()
            val number2 = Num2!!.text.toString().toInt()
            val sub = number1 - number2
            result!!.text = "Answer $sub"
        }
        button3!!.setOnClickListener {
            val number1 = Num1!!.text.toString().toInt()
            val number2 = Num2!!.text.toString().toInt()
            val mul = number1 * number2
            result!!.text = "Answer $mul"
        }
        btn4!!.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}