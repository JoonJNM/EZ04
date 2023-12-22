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
import com.example.ez04.databinding.ActivityQ3Binding

class Q3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q301: Button = findViewById(R.id.q301)
        val q302: Button = findViewById(R.id.q302)
        val q303: Button = findViewById(R.id.q303)
        val q304: Button = findViewById(R.id.q304)

        q301.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }

        q302.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q303.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q304.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}