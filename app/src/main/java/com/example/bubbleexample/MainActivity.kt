package com.example.bubbleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bubble.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Animating button infinitely with Pulse Effect on Background thread.*/
        button_java.bounceInAnim(repeat = BUBBLE_INFINITE)

        button_java.setOnClickListener {

            /*Animating textview with RubberBand effect on Button Click*/
            textview_java.rubberbandAnim()
            bounce_default_java.bounceInAnim()
            bounce_customised_java.bounceInAnim(2500, 5)

        }

        open_java_activity.setOnClickListener {
            startActivity(Intent(this, MainJavaActivity::class.java))
        }
    }
}
