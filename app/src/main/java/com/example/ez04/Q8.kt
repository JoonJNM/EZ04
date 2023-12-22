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
import com.example.ez04.databinding.ActivityQ8Binding

class Q8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q8)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q801: Button = findViewById(R.id.q801)
        val q802: Button = findViewById(R.id.q802)
        val q803: Button = findViewById(R.id.q803)
        val q804: Button = findViewById(R.id.q804)

        q801.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q802.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q803.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        q804.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}