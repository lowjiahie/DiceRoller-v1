package com.example.diceroller_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //Challenge
//        val countUpButton: Button = findViewById(R.id.countUp_button)
//        countUpButton.setOnClickListener { countUp() }

        //Homework
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
//        Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show() //show msg to user but user cannot interact with it

        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"

        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    //challenge coding
//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        if (resultText.text.toString() == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            var resultNum = resultText.text.toString().toInt()
//
//            if (resultNum < 6) {
//                resultNum += 1
//                resultText.text = resultNum.toString()
//            }
//        }
//    }

    //Homework
    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }


}