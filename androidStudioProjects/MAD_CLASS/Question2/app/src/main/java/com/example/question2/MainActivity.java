package com.example.question2;

/*
Create an application which generates a random color on each click
*/

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout layout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        button = findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Random random = new Random();
        int color = Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
        layout.setBackgroundColor(color);
    }
}
