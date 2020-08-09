package com.example.test8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ProgressBar progressBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar.setProgress(0);
                T obj = new T();
                obj.execute("100");

            }
        });
    }

    class T extends AsyncTask<String,Integer,String>{

        int i=0;
        @Override
        protected String doInBackground(String... strings) {

            int max = Integer.parseInt(strings[0]);
            while(i++ < max){
                try{
                    Thread.sleep(40);
                    publishProgress(i);

                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            progressBar.setProgress(values[0]);
            textView.setText(values[0].toString());
        }


    }
}
