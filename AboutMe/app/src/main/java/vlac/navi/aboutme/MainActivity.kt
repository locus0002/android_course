package vlac.navi.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import vlac.navi.aboutme.databinding.AboutmeActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: AboutmeActivityBinding
    private val myName: MyName = MyName("Vlac Sauce")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutme_activity)
        this.binding = DataBindingUtil.setContentView(this, R.layout.aboutme_activity)
        this.binding.myName = this.myName
        this.binding.doneBtn.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View?) {
        this.binding.apply {
            myName?.nickname = nicknameTxt.text.toString()
            invalidateAll()
            nicknameTxt.visibility = View.GONE
            nicknameLbl.visibility = View.VISIBLE
            view?.visibility = View.GONE
        }
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken,0)
    }
}