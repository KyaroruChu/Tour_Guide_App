package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //set the pagerAdapter
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager(), 1);

        //Set the adapter into the viewpager
        viewPager.setAdapter(adapter);

        //Link TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //Connect the tabLayout with the viewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}