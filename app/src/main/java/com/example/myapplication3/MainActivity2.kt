package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.moengage.cards.ui.CardActivity
import com.moengage.core.MoECoreHelper
import com.moengage.core.analytics.MoEAnalyticsHelper


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn2 = findViewById<View>(R.id.btn2) as MaterialButton
        val btn3 = findViewById<View>(R.id.btn3) as MaterialButton
        val btn4 = findViewById<View>(R.id.btn4) as MaterialButton
       btn2.setOnClickListener(View.OnClickListener {
           MoECoreHelper.logoutUser(this)
           val intent = Intent(this@MainActivity2, MainActivity::class.java)
           startActivity(intent)
       })
        btn3.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
    }
}