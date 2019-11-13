package com.example.bubbleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bubble.pulseAnim
import com.example.bubble.rubberBandAnim
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Animating button infinitely with Pulse Effect on Background thread.*/
        button.pulseAnim()

        button.setOnClickListener {

            /*Animating textview with Rubber Band effect on Button Click*/
            textview.rubberBandAnim()
        }

    }
}
