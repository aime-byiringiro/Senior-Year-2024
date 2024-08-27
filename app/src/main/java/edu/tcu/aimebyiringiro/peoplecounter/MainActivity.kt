package edu.tcu.aimebyiringiro.peoplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val countTextView = findViewById<TextView>(R.id.textView1)
        val addButton = findViewById<Button>(R.id.button1)
        val resetButton = findViewById<Button>(R.id.button2)
        var count = 0
        addButton.setOnClickListener{ _ ->
            count ++
            countTextView.text = count.toString()
        }

        resetButton.setOnClickListener{ _ ->
            val defaultCount = 0
            countTextView.text = defaultCount.toString()
            Toast.makeText(this, "Count before reset was $count" , Toast.LENGTH_SHORT).show ()
            count = 0
        }

        /*
        toastVAr?.cancel()
         */


        /**
         * Logically everything must march
         * The layout must march
         * Font size adn color ar optional
         */


    }
}