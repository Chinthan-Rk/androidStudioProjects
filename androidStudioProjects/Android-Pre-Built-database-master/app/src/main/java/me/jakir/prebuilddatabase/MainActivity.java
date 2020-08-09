package me.jakir.prebuilddatabase;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String DB_NAME = "test.db";
    String TABLE_NAME = "info";
    DataBaseHelper myDBHelper;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Copy database
        AssetDatabaseOpenHelper assetDatabaseOpenHelper = new AssetDatabaseOpenHelper(this, DB_NAME);
        assetDatabaseOpenHelper.saveDatabase();

        myDBHelper = new DataBaseHelper(this, DB_NAME);


        result = (TextView) findViewById(R.id.resultView);
        button = (Button) findViewById(R.id.btn_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Cursor res = myDBHelper.getAllData(TABLE_NAME);
//                if (res.getCount() == 0) {
//
//                    result.setText("No Data found, sorry!");
//
//                    return;
//                } else {
//                    StringBuffer buffer = new StringBuffer();
//                    while (res.moveToNext()) {
//                        buffer.append("Id: " + res.getString(0) + "\n");
//                        buffer.append("Name: " + res.getString(1) + "\n");
//                    }
//                    result.setText(buffer);
//
//                }
                String seatpool = "Female-Only";
                Cursor cur = myDBHelper.getReadableDatabase().rawQuery("select * from info where RoundNo = 7 and Seat_Pool = 'Female-Only' ", null);
                if (cur.moveToFirst()) {
                    do {
                        String branchName = cur.getString(cur.getColumnIndex("BranchName"));
                        Log.i("TAG", "BRANCH_NAME : " + branchName + "\n\n");
                    } while (cur.moveToNext());


                }


            }
        });
    }
}