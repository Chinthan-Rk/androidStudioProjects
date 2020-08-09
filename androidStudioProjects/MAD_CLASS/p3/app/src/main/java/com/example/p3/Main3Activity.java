package com.example.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("ACTIVITY2");
    }
}
