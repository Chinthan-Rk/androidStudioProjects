package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id,subject,message;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.editText);
        subject = findViewById(R.id.editText2);
        message = findViewById(R.id.editText3);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);

                i.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                i.setData(Uri.parse("mailto:"+id.getText().toString()));
                startActivity(i);
            }
        });


    }
}
