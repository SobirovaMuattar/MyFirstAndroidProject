package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name:String = "Muattar"
        val surname: String ="Sobirova"
        var age: Int = 20
        var height: Double = 163.0

        val summary: String = "name: $name  surname: $surname age: $age height: $height"

        output.text=summary

       Log.d("MainActivity", summary)

    }
}