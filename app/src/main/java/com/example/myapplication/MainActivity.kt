package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name:String = "Muattar"
        val surname: String ="Sobirova"
        var age: Int = 20
        var height: Double = 163.0

        age =21
        age = 22

        age = age + 1
        age += 1
        age ++

        val summary: String = "name: $name  surname: $surname age: $age height: $height"

        output.text=summary

       Log.d("MainActivity", summary)
        Toast.makeText(baseContext, summary, Toast.LENGTH_LONG).show()

    }
}