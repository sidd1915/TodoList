package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val taskbutton = findViewById<Button>(R.id.Task_btn)
        taskbutton.setOnClickListener {
            val Intent = Intent(this, MainScreenActivity::class.java)
            startActivity(Intent)

        }
    }
}