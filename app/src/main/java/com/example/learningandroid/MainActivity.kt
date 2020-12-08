package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
//            Toast.makeText(this, "Button works!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image) // Why is it ok to declare diceImage after rollDice() is called?
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val rolledDiceImage = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(rolledDiceImage)
    }
}