package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val img = findViewById<ImageView>(R.id.imageView)
        val nameTextView = findViewById<TextView>(R.id.name)
        val descriptionTextView = findViewById<TextView>(R.id.description)

        img.setImageResource(intent.getIntExtra("img", 0))
        nameTextView.text = intent.getStringExtra("name")
        descriptionTextView.text = intent.getStringExtra("description")

        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}