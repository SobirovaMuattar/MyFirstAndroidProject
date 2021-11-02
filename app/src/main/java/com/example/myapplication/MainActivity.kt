package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isFollow = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load("https://mocah.org/thumbs/523175-norway-landscape.jpg")
            .error(R.drawable.ic_launcher_background)
            .into(imgLoad)

        btnFollow.setOnClickListener { followUnfollow() }
        btnMessage.setOnClickListener { startActivity(Intent(this, MessageActivity::class.java)) }

    }

    private fun followUnfollow() {
        isFollow = !isFollow
        if (isFollow)
            btnFollow.text = "Unfollow"
        else
            btnFollow.text = "Follow"
    }
}
/*
class Automobile constructor (
    val brand: String,
    val engine: Engine
        )
{

    var currentSpend: Int = 0
}
    class Engine constructor(
        val id: Int

    )
fun main(){
    val engine = Engine(123545);
    val automobile= Automobile("Ford" engine)

}*/
