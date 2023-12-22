package com.example.ez04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Q6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q6)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q601: Button = findViewById(R.id.q601)
        val q602: Button = findViewById(R.id.q602)
        val q603: Button = findViewById(R.id.q603)
        val q604: Button = findViewById(R.id.q604)

        q601.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q602.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }

        q603.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q604.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}