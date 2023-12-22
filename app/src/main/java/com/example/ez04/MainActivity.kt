package com.example.ez04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val q101: Button = findViewById(R.id.q101)
        val q102: Button = findViewById(R.id.q102)
        val q103: Button = findViewById(R.id.q103)
        val q104: Button = findViewById(R.id.q104)

        var numrand:Int = 0

        q101.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("jumeng",numrand +1)
            startActivity(intent)
        }

        q102.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }

        q103.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }

        q104.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
    }
}