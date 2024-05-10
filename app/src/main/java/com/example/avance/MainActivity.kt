package com.example.avance

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: ImageButton = findViewById(R.id.Mybutton)
        myButton.setOnClickListener {
            val intent = Intent(this, segundoActivity::class.java)
            startActivity(intent)
        }
    }
}

