package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catList = listOf(
            Cat( "Cat 1", "Barsik", R.drawable.cat),
            Cat( "Cat 2", "Pushok", R.drawable.cat),
            Cat( "Cat 3", "Murchik", R.drawable.cat)
        )

        val button1 = findViewById<Button>(R.id.detailsButton1)
        val button2 = findViewById<Button>(R.id.detailsButton2)
        val button3 = findViewById<Button>(R.id.detailsButton3)

        findViewById<TextView>(R.id.name1).text = catList[0].name
        findViewById<TextView>(R.id.name2).text = catList[1].name
        findViewById<TextView>(R.id.name3).text = catList[2].name

        findViewById<TextView>(R.id.description1).text = catList[0].description
        findViewById<TextView>(R.id.description2).text = catList[1].description
        findViewById<TextView>(R.id.description3).text = catList[2].description

        findViewById<ImageView>(R.id.imageView1).setImageResource(catList[0].img)
        findViewById<ImageView>(R.id.imageView2).setImageResource(catList[1].img)
        findViewById<ImageView>(R.id.imageView3).setImageResource(catList[2].img)

        button1.setOnClickListener {
            navigateToSecond(catList[0])
        }
        button2.setOnClickListener {
            navigateToSecond(catList[1])
        }
        button3.setOnClickListener {
            navigateToSecond(catList[2])
        }
    }

    private fun navigateToSecond(cat: Cat) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", cat.name)
        intent.putExtra("description", cat.description)
        intent.putExtra("img", cat.img)
        startActivity(intent)
    }
}