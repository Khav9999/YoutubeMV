package com.dev.ekv.ytv.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.ekv.ytv.R;

public class HomeFragment extends FragmentEditable{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.app_bar_main, container, false);
        tabLayout = view.findViewById(R.id.movie_type_tab_bar);
        tabLayout.setVisibility(View.GONE);
        return view;
    }

    // This newInstant variable use send data across fragment and react data that interact with other fragment
    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
