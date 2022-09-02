package com.example.testowy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var czyNapis = true

        findViewById<Button>(R.id.buttonForKiev).setOnClickListener {
            if (czyNapis==true) {
                findViewById<Button>(R.id.buttonForKiev).text = "Zmienione"
                czyNapis=false
                findViewById<ImageView>(R.id.imageView).isVisible = false
            }
            else {
                findViewById<Button>(R.id.buttonForKiev).text = "Click"
                czyNapis=true
                findViewById<ImageView>(R.id.imageView).isVisible = true
            }
        }
    }
}