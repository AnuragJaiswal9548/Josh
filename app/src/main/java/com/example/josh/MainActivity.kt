package com.example.josh

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.w3c.dom.Text
import java.util.Vector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val b1 = findViewById<ImageView>(R.id.img_b1)
        b1.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, B1::class.java)
            startActivity(intent)
        }

        val b2 = findViewById<ImageView>(R.id.img_b2)
        b2.setOnClickListener {
            val intent:Intent = Intent(this@MainActivity, B2::class.java)
            startActivity(intent)
        }
        val b3 = findViewById<ImageView>(R.id.img_b3)
        b3.setOnClickListener {
            val intent:Intent = Intent(this@MainActivity, B3::class.java)
            startActivity(intent)
        }
        val b4 = findViewById<ImageView>(R.id.img_b4)
        b4.setOnClickListener {
            val intent:Intent = Intent(this@MainActivity, B4::class.java)
            startActivity(intent)
        }
    }
}