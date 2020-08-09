package com.example.question1;

/*

Write an application to demonstrate the activity lifecycle
by logging the activities in the LogCat or toast at every stage.

 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate() called");
    }

    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }

}
