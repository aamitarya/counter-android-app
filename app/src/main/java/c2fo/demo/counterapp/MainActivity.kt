package c2fo.demo.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCounterText()

        decrementBtn.setOnClickListener {
            count--
            setCounterText()
        }

        incrementBtn.setOnClickListener {
            count++
            setCounterText()
        }
    }

    private fun setCounterText() {
        counterTv.text = "Counter = " + count
    }
}