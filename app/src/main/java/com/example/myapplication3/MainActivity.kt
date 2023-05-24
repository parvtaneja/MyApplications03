package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.moengage.core.analytics.MoEAnalyticsHelper
import com.moengage.inapp.MoEInAppHelper
import com.moengage.pushbase.MoEPushHelper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)
        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton
        MoEPushHelper.getInstance().requestPushPermission(this)
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin2" && password.text.toString() == "admin2") {
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_SHORT).show()

                MoEAnalyticsHelper.setUniqueId(this,username.text.toString())
                MoEAnalyticsHelper.setFirstName(this,username.text.toString())
                val properties = com.moengage.core.Properties()
                MoEAnalyticsHelper.setFirstName(this,username.text.toString())
                MoEAnalyticsHelper.trackEvent(this, "login", properties)
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this@MainActivity, "Login Fail!", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onStart(){
        super.onStart()
        MoEInAppHelper.getInstance().showInApp(this)

    }
}