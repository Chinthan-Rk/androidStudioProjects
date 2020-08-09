package com.example.p3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu,menu);
     return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         switch (item.getItemId())
         {
             case R.id.item1:
                 startActivity(new Intent(this,Main2Activity.class));
                 break;
             case R.id.item2:
                 startActivity(new Intent(this,Main3Activity.class));
                 break;
              default:
         }

        return super.onOptionsItemSelected(item);
    }
}
