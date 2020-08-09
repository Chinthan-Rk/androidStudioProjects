package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendFoodSelection(View view){
        switch (view.getId()){
            case R.id.checkBox1:
                Toast.makeText(getApplicationContext(), "Food 1 is checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                Toast.makeText(getApplicationContext(), "Food 2 is checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                Toast.makeText(getApplicationContext(), "Food 3 is checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:
                Toast.makeText(getApplicationContext(), "Food 4 is checked", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
