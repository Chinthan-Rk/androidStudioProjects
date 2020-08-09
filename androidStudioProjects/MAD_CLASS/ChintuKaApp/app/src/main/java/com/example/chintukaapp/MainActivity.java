package com.example.chintukaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sendButton;
    EditText textPhone;
    EditText textMessage;
    String phoneNumber;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button)findViewById(R.id.button1);
        textMessage = (EditText)findViewById(R.id.editText2);
        textPhone = (EditText)findViewById(R.id.editText);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                phoneNumber = textPhone.getText().toString();
                message = textMessage.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(phoneNumber,null,message,null,null);
                Toast.makeText(getApplicationContext(), "SMS SENT", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
