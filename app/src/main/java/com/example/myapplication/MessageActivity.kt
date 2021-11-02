package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        btnSend.setOnClickListener {
            if (edtMessage.text.isNotBlank()) {
                tvTitle.text = "${tvTitle.text}+\n+${edtMessage.text}"
            }
        }
    }
}