package com.example.activity_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnl: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            castView ()
            onClick ()

        }
        fun castView(){
            btnl=findViewById(R.id.btns)

        }
        fun onClick(){
            btnl.setOnClickListener {
                val intent= Intent(baseContext,signup_activity::class.java)
                startActivity(intent)
            }

        }
    }

