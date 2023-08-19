package com.example.innogeeks_task_gogreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val alreadyHasAccountButton=findViewById<TextView>(R.id.alreadyHasAccountTextView)
        alreadyHasAccountButton.setOnClickListener {
            // Start the RegisterActivity when "Click here" is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}