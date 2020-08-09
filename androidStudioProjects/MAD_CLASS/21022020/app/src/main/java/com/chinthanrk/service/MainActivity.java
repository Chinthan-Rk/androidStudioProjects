package com.chinthanrk.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;

//    handler = new Handler();
//
//    final Runnable r = new Runnable() {
//        public void run() {
//            tv.append("Hello World");
//            handler.postDelayed(this, 1000);
//        }
//    };
//
//handler.postDelayed(r, 1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getApplicationContext(),MyService.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(),MyService.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,newPage.class));
            }
        });
    }

    protected  void findViews(){
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
    }
}
