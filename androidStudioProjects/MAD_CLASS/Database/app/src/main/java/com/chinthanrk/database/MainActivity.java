package com.chinthanrk.database;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2,editText3;
    Button button1,button2,button3,button4;
    SQLiteDatabase sqLiteDatabase ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();
                String usn = editText2.getText().toString();
                String phone = editText3.getText().toString();

                ContentValues contentValues = new ContentValues();
                contentValues.put("name", name);
                contentValues.put("usn", usn);
                contentValues.put("phone", phone);


                sqLiteDatabase.insert("student", null, contentValues);
                Toast.makeText(MainActivity.this, "Inserted Values", Toast.LENGTH_SHORT).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor cursor = sqLiteDatabase.rawQuery("select * from student", null);
                if (cursor.getCount() <= 0)
                    Toast.makeText(MainActivity.this, "No records", Toast.LENGTH_SHORT).show();
                else {
                    for (int i = 0; i < cursor.getCount(); i++) {
                        cursor.moveToNext();
                        String stud = "";
                        stud += "Name  : " + cursor.getString(0);
                        stud += "USN  : " + cursor.getString(1);
                        stud += "Phone Number  : " + cursor.getString(2);

                        Toast.makeText(MainActivity.this, stud, Toast.LENGTH_SHORT).show();

                    }
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usn = editText2.getText().toString();
                sqLiteDatabase.delete("student","usn=?",new String[]{usn});
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String phone = editText3.getText().toString();
                String usn = editText2.getText().toString();

                ContentValues contentValues = new ContentValues();
                contentValues.put("name", name);
                contentValues.put("phone", phone);
                sqLiteDatabase.update("student",contentValues,"usn=?",new String[]{usn});
                Toast.makeText(getApplicationContext(), "Updated", Toast.LENGTH_SHORT).show();
            }
        });

    }


    

    protected void findViews(){
        
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        button1 =  findViewById(R.id.button);
        button2 =  findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        sqLiteDatabase = new database(this).getWritableDatabase();
    }
}
