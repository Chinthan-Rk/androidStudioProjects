package com.example.p5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    CheckBox c1,c2,c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
            int total=0;


        if(c1.isChecked())
        {
            total=total+100;
        }
        if (c2.isChecked())
        {
            total=total+200;
        }
        if(c3.isChecked())
        {
            total=total+300;
        }
        Toast.makeText(getApplicationContext(),"TOTAL "+total,Toast.LENGTH_SHORT).show();



    }
}
