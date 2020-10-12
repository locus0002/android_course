package vlac.navi.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.roll_btn)
        rollBtn.text = "Let's Roll"
        rollBtn.setOnClickListener {
            rollDice()
        }
        this.diceImg = findViewById(R.id.dice_img)
    }

    private fun rollDice() {
        val diceResource = when(Random.nextInt(1,7)) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        this.diceImg.setImageResource(diceResource)
    }
}