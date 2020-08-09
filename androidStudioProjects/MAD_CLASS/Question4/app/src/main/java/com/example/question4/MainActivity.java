package com.example.question4;
//Implement context menu concept in application  to change the background color.
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        layout = findViewById(R.id.layout);
        int color;

        switch (item.getItemId()){
            case R.id.item1:
                 color = Color.rgb(255,0,0);
                layout.setBackgroundColor(color);
                break;
            case R.id.item2:
                color = Color.rgb(0,255,0);
                layout.setBackgroundColor(color);
                break;
            case R.id.item3:
                color = Color.rgb(0,0,255);
                layout.setBackgroundColor(color);
                break;

        }

        return super.onContextItemSelected(item);
    }
}
