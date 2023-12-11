package com.example.homeworks_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.homeworks_kotlin.R

class MainActivity : AppCompatActivity() {

    val a: Double = 34456.5
    val b: Int = 32456
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv1 = findViewById<TextView>(R.id.textview1)
        tv1.text = "$a и $b"
        var butsum = findViewById<Button>(R.id.butsum)
        butsum.setOnClickListener {
            val res: Double = a + b.toDouble()
            tv1.text = "Результат сложения равен: $res"
        }
        var butsub = findViewById<Button>(R.id.butsub)
        butsub.setOnClickListener {
            val res: Double = a - b.toDouble()
            tv1.text = "Результат вычитания равен: $res"
        }
        var butmulti = findViewById<Button>(R.id.butmulti)
        butmulti.setOnClickListener {
            val res: Double = a * b.toDouble()
            tv1.text = "Результат умножения равен: $res"
        }
    }

}