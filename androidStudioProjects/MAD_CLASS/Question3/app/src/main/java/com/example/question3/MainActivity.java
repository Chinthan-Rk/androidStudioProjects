package com.example.question3;
/*
Implement option menu concept in application to choose between two activities.
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                startActivity(new Intent(this,DisplayMessageActivity.class));
                break;
            case R.id.item2:
                startActivity(new Intent(this,DisplayMessageActivity2.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
