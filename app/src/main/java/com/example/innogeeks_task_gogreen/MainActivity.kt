package com.example.innogeeks_task_gogreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val createAccountButton=findViewById<TextView>(R.id.createAccountTextView)
        createAccountButton.setOnClickListener({
            // Start the RegisterActivity when "Click here" is clicked
            val intent = Intent(this@MainActivity, register::class.java)
            startActivity(intent)
        })

    }
}