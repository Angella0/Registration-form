package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class coursesactivity : AppCompatActivity() {

    lateinit var btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)

        Next()
        clickButton()


    }

    fun Next(){
        btnNext = findViewById(R.id.btnNext)
    }
    fun clickButton(){
        btnNext.setOnClickListener {
            val intent = Intent(baseContext, Registeractivity::class.java)
            startActivity(intent)

        }
    }
}