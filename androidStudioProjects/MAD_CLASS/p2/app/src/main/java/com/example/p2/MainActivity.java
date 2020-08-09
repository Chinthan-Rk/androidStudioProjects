package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    ConstraintLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        l=(ConstraintLayout)findViewById(R.id.lay);

        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Random r = new Random();
        l.setBackgroundColor(Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
        
    }
}
