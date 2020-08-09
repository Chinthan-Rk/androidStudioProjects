package com.chinthanrk.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Sections extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentsList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public Sections(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentsList.add(fragment);
        fragmentTitleList.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }
}
