package com.example.ez04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Q7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q7)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q701: Button = findViewById(R.id.q701)
        val q702: Button = findViewById(R.id.q702)
        val q703: Button = findViewById(R.id.q703)
        val q704: Button = findViewById(R.id.q704)

        q701.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }

        q702.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

        q703.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q704.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}