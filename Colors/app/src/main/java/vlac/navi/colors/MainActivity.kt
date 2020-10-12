package vlac.navi.colors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val listView = listOf<View>(
            box_one,
            box_two_txt,
            box_three_text,
            box_four_text,
            box_five_text,
            layout_c,
            red_button,
            yellow_button,
            blue_button)
        listView.forEach { it.setOnClickListener { makeColored(it) } }
    }

    private fun makeColored(view: View?) {
        when(view?.id) {
            R.id.box_one -> view.setBackgroundColor(Color.BLUE)
            R.id.box_two_txt -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_three_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_four_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.red_button -> box_two_txt.setBackgroundColor(Color.RED)
            R.id.blue_button -> box_three_text.setBackgroundColor(Color.BLUE)
            R.id.yellow_button -> box_four_text.setBackgroundColor(Color.YELLOW)
            else -> { view?.setBackgroundColor(Color.LTGRAY) }
        }
    }
}