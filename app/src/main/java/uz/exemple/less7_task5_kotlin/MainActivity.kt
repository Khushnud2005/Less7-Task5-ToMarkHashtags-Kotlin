package uz.exemple.less7_task5_kotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val text = "I would #like to do #something, similar to the #Twitter app"

        val tv = findViewById<TextView>(R.id.textView)
        val textSpan: Spannable = SpannableString(text)
        for (i in 0 until text.length) {
            if (text.toCharArray()[i] == '#') {
                for (j in i until text.length) {
                    if (text.toCharArray()[j] == ' ' || text.toCharArray()[j] == '.' || text.toCharArray()[j] == ','|| text.toCharArray()[j] == '-') {
                        textSpan.setSpan(
                            ForegroundColorSpan(Color.GREEN),
                            i,
                            j,
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                        )
                        break
                    }
                }
            }
        }
         tv.setText(textSpan);

    }
}