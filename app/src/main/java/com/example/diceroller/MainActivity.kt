package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.BRoll);

        rollButton.setOnClickListener {
            rollDice()
            rollDice2()
        }


    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultadoTextView: TextView = findViewById(R.id.textView)
        resultadoTextView.text = diceRoll.toString()

    }

    private fun rollDice2() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultadoTextView2: TextView = findViewById(R.id.textView2)
        resultadoTextView2.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
