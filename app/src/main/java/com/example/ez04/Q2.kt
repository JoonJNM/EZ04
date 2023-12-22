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
import com.example.ez04.databinding.ActivityQ2Binding

class Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q201: Button = findViewById(R.id.q201)
        val q202: Button = findViewById(R.id.q202)
        val q203: Button = findViewById(R.id.q203)
        val q204: Button = findViewById(R.id.q204)

        q201.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q202.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q203.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        q204.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}