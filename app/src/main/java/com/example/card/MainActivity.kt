package com.example.card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Loads activity_main.xml — MaterialCardView layout defined in XML
        setContentView(R.layout.activity_main)
    }
}
