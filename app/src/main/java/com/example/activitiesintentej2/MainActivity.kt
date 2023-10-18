package com.example.activitiesintentej2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirActivity2(view: View) {
        val intent = Intent(this, Activity2::class.java);
        startActivity(intent)
    }
}