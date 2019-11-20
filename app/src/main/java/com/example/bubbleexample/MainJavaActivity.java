package com.example.bubbleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bubble.BubbleKt;

public class MainJavaActivity extends AppCompatActivity {
    TextView textViewJava, bounceDefaultJava, bounceCustomisedJava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        Button button = findViewById(R.id.button_java);
        textViewJava = findViewById(R.id.textview_java);
        bounceDefaultJava = findViewById(R.id.bounce_default_java);
        bounceCustomisedJava = findViewById(R.id.bounce_customised_java);


        BubbleKt.bounceInAnim(button, BubbleKt.DEFAULT_DURATION, BubbleKt.BUBBLE_INFINITE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BubbleKt.rubberbandAnim(textViewJava);

                BubbleKt.bounceInAnim(bounceDefaultJava);

                BubbleKt.bounceInAnim(bounceCustomisedJava, 2500, 5);
            }
        });
    }
}
