package com.lambdaschool.rainbow

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_red.setOnClickListener { parent_view.setBackgroundColor(Color.RED) }
        button_orange.setOnClickListener { parent_view.setBackgroundColor(getColor(android.R.color.holo_orange_dark)) }
        button_yellow.setOnClickListener { parent_view.setBackgroundColor(Color.YELLOW) }
        button_green.setOnClickListener { parent_view.setBackgroundColor(Color.GREEN) }
        button_blue.setOnClickListener { parent_view.setBackgroundColor(Color.BLUE) }
        button_purple.setOnClickListener { parent_view.setBackgroundColor(getColor(android.R.color.holo_purple)) }
    }
}
