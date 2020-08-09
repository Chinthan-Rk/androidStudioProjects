package com.example.question11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String department[] = {"Computer Science", "Information Science", "Biotech", "Mech", "Civil", "EC"};
    DatePicker datePicker;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter = new ArrayAdapter(this, R.layout.couse_item, department);
        datePicker = findViewById(R.id.datePicker);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String date = datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear();
                String message = "Department : " + department[position] + "\nDate : " + date;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
