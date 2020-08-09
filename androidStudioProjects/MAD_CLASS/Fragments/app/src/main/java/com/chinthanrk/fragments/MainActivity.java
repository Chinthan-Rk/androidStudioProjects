package com.chinthanrk.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Sections sections;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sections = new Sections(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        Sections adapter = new Sections(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "Fragment 1");
       // adapter.addFragment(new Fragment2(), "Fragment 2");
        //adapter.addFragment(new Fragment3(), "Fragment 3");

        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}
