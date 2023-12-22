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
import com.example.ez04.databinding.ActivityQ4Binding

class Q4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q401: Button = findViewById(R.id.q401)
        val q402: Button = findViewById(R.id.q402)
        val q403: Button = findViewById(R.id.q403)
        val q404: Button = findViewById(R.id.q404)

        q401.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }

        q402.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q403.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q404.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}