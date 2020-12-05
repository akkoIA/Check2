package com.example.check2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count: Int = 0

        button.setOnClickListener {
            count++
            countText.text = count.toString()
        }

        button2.setOnClickListener {
            count--
            countText.text = count.toString()
        }

        button3.setOnClickListener {
            count+10
            countText.text = count.toString()
        }

        button4.setOnClickListener {
            count - 10
            countText.text = count.toString()
        }


        button.setBackgroundColor(Color.parseColor("#47885e"))
        button2.setBackgroundColor(Color.parseColor("#47885e"))
        button3.setBackgroundColor(Color.parseColor("#47885e"))
        button4.setBackgroundColor(Color.parseColor("#47885e"))
    }
}
