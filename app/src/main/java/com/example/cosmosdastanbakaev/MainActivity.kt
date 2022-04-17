package com.example.cosmosdastanbakaev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_change_frame.setOnClickListener{
            val intent = Intent(this, MassageForm::class.java)
            startActivity(intent)
        }

    }
}