package com.example.question5;
//Design four checkboxes namely any four food items.
//Find total amount of food items selected in Toast message.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void displayCheckBoxMessage(View view){
        boolean check = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox1:
                if(check)
                    Toast.makeText(this, "Food 1 is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if(check)
                    Toast.makeText(this, "Food 2 is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                if(check)
                    Toast.makeText(this, "Food 3 is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:
                if(check)
                    Toast.makeText(this, "Food 4 is selected", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
