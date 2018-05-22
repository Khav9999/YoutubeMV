package com.dev.ekv.ytv.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dev.ekv.ytv.R;
import com.dev.ekv.ytv.adapter.MoviesPagerAdapter;
import com.dev.ekv.ytv.fragments.ContentMovieFragment;
import com.dev.ekv.ytv.fragments.HomeFragment;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.movie_type_tab_bar);
        tabLayout.setupWithViewPager(viewPager);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_item_home_movies);
        setFragment(new HomeFragment());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int navigationItemID = item.getItemId();
        switch (navigationItemID){
            case R.id.nav_item_home_movies :
                tabLayout.setVisibility(View.GONE);
                setFragment(new HomeFragment());
                break;
            case R.id.nav_item_khmer_movies:
            case R.id.nav_item_thai_movies:
            case R.id.nav_item_chinese_movies:
            case R.id.nav_item_hong_kong_movies:
            case R.id.nav_item_other_movies:
                tabLayout.setVisibility(View.VISIBLE);
                setFragment(new ContentMovieFragment());
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setupViewPager(ViewPager viewPager) {
        MoviesPagerAdapter adapter = new MoviesPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeFragment(), "Home");
        adapter.addFrag(new ContentMovieFragment(), "Drama");
        adapter.addFrag(new ContentMovieFragment(), "Action");
        adapter.addFrag(new ContentMovieFragment(), "Scary");
        adapter.addFrag(new ContentMovieFragment(), "Hornor");
        adapter.addFrag(new ContentMovieFragment(), "Funny");
        viewPager.setAdapter(adapter);
    }
}
