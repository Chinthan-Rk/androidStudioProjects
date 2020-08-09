package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        Log.i("LIFE ACTIVITY","DESTROY");
        Toast.makeText(getApplicationContext(),"Destroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Log.i("LIFE ACTIVITY","START");
        Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i("LIFE ACTIVITY","STOP");
        Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i("LIFE ACTIVITY","RESTART");
        Toast.makeText(getApplicationContext(),"restart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("LIFE ACTIVITY","PAUSE");
        Toast.makeText(getApplicationContext(),"pause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {

        Log.i("LIFE ACTIVITY","DESTROY");
        Toast.makeText(getApplicationContext(),"RESUME",Toast.LENGTH_SHORT).show();   super.onResume();
    }
}
