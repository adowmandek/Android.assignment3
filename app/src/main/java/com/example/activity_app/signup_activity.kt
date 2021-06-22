package com.example.activity_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class signup_activity : AppCompatActivity() {

    lateinit var btns: Button
    lateinit var spGender:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        spGender=findViewById(R.id.spGender)
        btns=findViewById(R.id.btns)

        btns.setOnClickListener {
            val intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }

    val gender= arrayOf("female","male")
    val adapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
            spGender.adapter=adapter

    }
}

