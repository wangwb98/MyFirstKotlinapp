package com.asrmicro.os.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textview_random
import kotlinx.android.synthetic.main.activity_second.textview_label
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }
    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt:Int = 0
        if (count > 0)
            randomInt = random.nextInt(count + 1)
        textview_random.text = randomInt.toString()
        textview_label.text = getString(R.string.random_heading, count)
    }
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
