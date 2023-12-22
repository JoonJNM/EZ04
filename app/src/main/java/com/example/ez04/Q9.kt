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
import com.example.ez04.databinding.ActivityQ9Binding

class Q9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q9)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q901: Button = findViewById(R.id.q901)
        val q902: Button = findViewById(R.id.q902)
        val q903: Button = findViewById(R.id.q903)
        val q904: Button = findViewById(R.id.q904)

        q901.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q902.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q903.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        q904.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}