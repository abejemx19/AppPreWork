package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.HelloButton)
        val button2 = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            Log.v("Hello World", "Button CLicked")
            Toast.makeText(this, "Hello To You too!", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            Log.v("Hello World", "Button CLicked")
            Toast.makeText(this, "Hello To You !", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Hello To You 2!", Toast.LENGTH_SHORT).show()
        }
    }
}