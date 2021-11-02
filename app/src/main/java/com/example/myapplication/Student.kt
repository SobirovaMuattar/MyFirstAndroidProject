package com.example.myapplication

import android.widget.TextView

class Student(private val textView: TextView, incomingId: Int, incomingName: String) {

    var id: Int = 0
    var name: String = ""


    init {
        this.id = incomingId
        this.name = incomingName

        textView.text =
            textView.text.toString() + "Student with id = ${this.id}  has been initialised"
    }

    fun comeToSchool() {
        textView.text =
            textView.text.toString() + "\nStudent with id = ${this.id}  has come to school"
    }

    fun study() {
        textView.text =
            textView.text.toString() + "\nStudent with id = ${this.id}  is studying"
    }

    fun calculate(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun leaveSchool() {
        textView.text = textView.text.toString() + "\nStudent with id = ${this.id} leave the school"
    }


}