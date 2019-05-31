package com.example.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button redBtn;
    Button ojBtn;
    Button yellowBtn;
    Button greenBtn;
    Button blueBtn;
    Button indigoBtn;

    LinearLayout layoutBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.btn_red);
        ojBtn = findViewById(R.id.btn_oj);
        yellowBtn = findViewById(R.id.btn_yellow);
        greenBtn = findViewById(R.id.btn_green);
        blueBtn = findViewById(R.id.btn_blue);
        indigoBtn = findViewById(R.id.btn_indigo);

        layoutBackground = findViewById(R.id.layout_background);

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

        ojBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
            }
        });

        yellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
            }
        });

        indigoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });
    }
}
