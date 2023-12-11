package com.example.homeworks_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.homeworks_kotlin.R

class MainActivity : AppCompatActivity() {

    val a: Int = 34456
    val b: Int = 32456

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv1 = findViewById<TextView>(R.id.textview1)
        tv1.text = "$a и $b"
        var butsum = findViewById<Button>(R.id.butsum)
        butsum.setOnClickListener {
            val res: Int  = a + b
            tv1.text = "Результат сложения равен: $res"
        }
        var butsub = findViewById<Button>(R.id.butsub)
        butsub.setOnClickListener {
            val res: Int = a - b
            tv1.text = "Результат вычитания равен: $res"
        }
        var butmulti = findViewById<Button>(R.id.butsub)
        butmulti.setOnClickListener {
            val res: Int = a * b
            tv1.text = "Результат умножения равен: $res"
        }
    }

}