package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    TextView textView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        progressBar.setProgress(0);

        T t1 = new T();
        t1.execute("100");

    }

    class T extends AsyncTask<String, Integer, String> {

        int i = 0;

        @Override
        protected String doInBackground(String... strings) {

            int max = Integer.parseInt(strings[0]);
            while (i < max) {
                try {

                    Thread.sleep(40);
                    i++;
                    publishProgress(i);

                } catch (Exception e) {
                    System.out.println("Exception : " + e);
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            progressBar.setProgress(values[0]);
            super.onProgressUpdate(values);
            textView.setText(values[0].toString());
        }
    }
}
