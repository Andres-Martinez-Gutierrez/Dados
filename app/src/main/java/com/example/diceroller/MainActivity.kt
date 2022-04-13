package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

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

    /**
     * Tira los dados y actualiza la pantalla con el resultado.
     */
    private fun rollDice() {
        // Crea un nuevo objeto Dice con 6 lados y tira los dados
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Encuentra la ImageView en el diseño
       val diceImage : ImageView = findViewById(R.id.imageView4)
        /** Determine qué ID de recurso drawable
         * usar en función de la tirada de dados
         */
        val drawableresourse = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Actualizar ImageView con el ID de recurso drawable correcto
        diceImage.setImageResource(drawableresourse)

        // Actualizar la descripción del contenido
        diceImage.contentDescription = diceRoll.toString()


    }

    private fun rollDice2() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceImagen: ImageView = findViewById(R.id.caraDadoUno)

        val drawableResourse = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImagen.setImageResource(drawableResourse)

        diceImagen.contentDescription = diceRoll.toString()


    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}
