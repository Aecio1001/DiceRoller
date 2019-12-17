package diceroller.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val resetButton: Button = findViewById(R.id.reset)
        resetButton.setOnClickListener { resetDice() }
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

    }

    private fun getRandomDiceImage() : Int {
        val randomInt = Random.nextInt(6) + 1

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun resetDice() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val drawableResource = R.drawable.empty_dice
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource)


        //  Toast.makeText(this, "button3 clicked",
        //    Toast.LENGTH_SHORT).show()
       // val value = 0

      //  val diceImage: ImageView = findViewById(R.id.dice_image)
        //diceImage.text = value.toString()
    }
}
