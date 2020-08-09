package com.example.question7;
//Write an application to demonstrate Spinner component to display selected items
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String[] country = { "Papa Cow", "Mama Cow", "Baby Cow", "Cow Cow", "Holy Cow"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> arrayAdapter = new ArrayAdapter<CharSequence>(this,R.layout.support_simple_spinner_dropdown_item,country);
       //arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,""+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this,"Nothing is selected Bitch !!",Toast.LENGTH_SHORT).show();
    }
}
