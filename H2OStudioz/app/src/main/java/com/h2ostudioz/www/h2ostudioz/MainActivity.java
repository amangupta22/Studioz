package com.h2ostudioz.www.h2ostudioz;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new InfoFragment(), "Info");
        viewPagerAdapter.addFragments(new ImageGalleryFragment(),"Image Gallery");
        viewPagerAdapter.addFragments(new VideosFragment(), "Videos");
        viewPagerAdapter.addFragments(new EventsFragment(),"Events");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
