package com.dev.ekv.ytv.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.ekv.ytv.R;

/**
 * Created by EKV on 5/11/2018 AD.
 */

public class FragmentEditable extends BaseFragment {

    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.app_bar_main,container,false);
        tabLayout = view.findViewById(R.id.movie_type_tab_bar);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    public void LoadMoviesData(String data){

    }
}
