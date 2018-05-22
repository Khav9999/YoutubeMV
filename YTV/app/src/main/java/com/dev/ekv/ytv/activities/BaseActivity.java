package com.dev.ekv.ytv.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ProgressBar;

import com.dev.ekv.ytv.R;

import java.util.Stack;

/**
 * Created by EKV on 5/11/2018 AD.
 */

public class BaseActivity extends AppCompatActivity {

    public Stack<Fragment> fragments = new Stack<>();
    public ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);
    }
    public void setFragment(Fragment fragment) {
        fragments.clear();
        fragments.push(fragment);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fram_movie_content, fragment);
        ft.commit();
        ft.attach(fragment);
    }
}
