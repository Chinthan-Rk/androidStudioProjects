package com.example.test6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editText1.getText().toString();
                String message = editText2.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+phoneNumber));
                intent.putExtra("sms_body",message);
                startActivity(intent);

            }
        });

    }
}
