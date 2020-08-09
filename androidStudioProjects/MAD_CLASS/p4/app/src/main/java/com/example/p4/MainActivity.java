package com.example.p4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 =(TextView)findViewById(R.id.textView);
        registerForContextMenu(t1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        ConstraintLayout c = (ConstraintLayout)findViewById(R.id.lay);
        switch (item.getItemId())
        {
            case R.id.item1:
                c.setBackgroundColor(Color.RED);
                break;
            case R.id.item2:
                c.setBackgroundColor(Color.BLUE);
                break;
            case R.id.item3:
                c.setBackgroundColor(Color.GREEN);
                break;
             default:


        }
        return super.onContextItemSelected(item);
    }
}
