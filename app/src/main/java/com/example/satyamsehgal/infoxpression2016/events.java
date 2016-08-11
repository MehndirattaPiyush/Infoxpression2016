package com.example.satyamsehgal.infoxpression2016;

import android.os.Build;
import android.support.design.widget.TabLayout;

import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import Adapters.TabPagerAdapter;


public class events extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark,null ));
        }
        TabLayout obj = (TabLayout) findViewById(R.id.tablayout);
        obj.addTab(obj.newTab().setText("Electronics"));
        obj.addTab(obj.newTab().setText("Programming"));
        obj.addTab(obj.newTab().setText("Nontech"));
        obj.addTab(obj.newTab().setText("Codesprint"));
        obj.addTab(obj.newTab().setText("Entreprenuarship"));
        obj.addTab(obj.newTab().setText("Varta"));
        obj.addTab(obj.newTab().setText("Workshops"));
        obj.setTabGravity(obj.GRAVITY_FILL);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
       final ViewPager viewPager = (ViewPager) findViewById(R.id.vpPager);
       final TabPagerAdapter TabAdapter = new TabPagerAdapter(getSupportFragmentManager(), obj.getTabCount());
         viewPager.setCurrentItem(1);
        // Set up the ViewPager with the sections adapter.

        viewPager.setAdapter(TabAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(obj));
        obj.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_events, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
          //  int id = item.getItemId();
            if (item.getItemId() == android.R.id.home) {
                finish();
                return true;
            } else
                return super.onOptionsItemSelected(item);
        }

    }
