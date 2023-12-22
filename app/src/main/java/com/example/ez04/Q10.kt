package com.example.ez04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ez04.databinding.ActivityQ10Binding

class Q10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q10)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q1001: Button = findViewById(R.id.q1001)
        val q1002: Button = findViewById(R.id.q1002)
        val q1003: Button = findViewById(R.id.q1003)
        val q1004: Button = findViewById(R.id.q1004)

        q1001.setOnClickListener {
            val intent = Intent(this, Last::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q1002.setOnClickListener {
            val intent = Intent(this, Last::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }

        q1003.setOnClickListener {
            val intent = Intent(this, Last::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q1004.setOnClickListener {
            val intent = Intent(this, Last::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}