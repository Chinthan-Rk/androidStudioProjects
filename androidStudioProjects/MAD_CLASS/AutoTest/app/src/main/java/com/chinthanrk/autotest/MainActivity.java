package com.chinthanrk.autotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int val2;
    String val;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = editText.getText().toString().trim();
                val2 = Integer.parseInt(val);
                Toast.makeText(MainActivity.this, ""+val2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
