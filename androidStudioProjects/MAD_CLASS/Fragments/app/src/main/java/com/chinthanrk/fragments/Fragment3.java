package com.chinthanrk.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    private static final String TAG = "fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag3, container, false);

        btnNavFrag1 = view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = view.findViewById(R.id.btnNavFrag3);

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "GOING TO 1", Toast.LENGTH_SHORT).show();

                ((MainActivity) getActivity()).setViewPager(0);
            }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "GOING TO 2", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).setViewPager(0);

            }
        });
        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "GOING TO 3", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).setViewPager(0);

            }
        });


        return view;
    }
}
