package com.example.ez04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Q5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q5)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q501: Button = findViewById(R.id.q501)
        val q502: Button = findViewById(R.id.q502)
        val q503: Button = findViewById(R.id.q503)
        val q504: Button = findViewById(R.id.q504)

        q501.setOnClickListener {
            val intent = Intent(this, Q6::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q502.setOnClickListener {
            val intent = Intent(this, Q6::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q503.setOnClickListener {
            val intent = Intent(this, Q6::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        q504.setOnClickListener {
            val intent = Intent(this, Q6::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}