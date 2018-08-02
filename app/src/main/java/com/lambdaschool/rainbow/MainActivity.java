package com.lambdaschool.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btnBlue, btnGreen, btnOrange, btnPurple, btnRed, btnGray;
    LinearLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlue   = findViewById(R.id.button_blue);
        btnGreen  = findViewById(R.id.button_green);
        btnOrange = findViewById(R.id.button_orange);
        btnPurple = findViewById(R.id.button_purple);
        btnRed    = findViewById(R.id.button_red);
        btnGray   = findViewById(R.id.button_gray);

        layoutBackground = findViewById(R.id.background);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });

        btnGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
            }
        });

        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });

    }
}
