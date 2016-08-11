package com.example.satyamsehgal.infoxpression2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import Adapters.Customgrid;
import Adapters.Sponsorsgrid;

public class Sponsors extends AppCompatActivity {

    GridView g;
    String[] a={"Title Sponsor","Programming partner","technical Partner","Co-sponsor",
               "Associate Partners","","News Partners","","Foss Partner","Beverage Partner",
                "Banking Partner","Social Impact Partners","","Event Sponsor","Style Partner",
                 "Education partners","","Startup Partners","","","Stationery Partner"};
    int[] imageid={
            R.drawable.title_coding_ninja,R.drawable.programming_codechef,R.drawable.tech_gfg,R.drawable.ic_launcher,
            R.drawable.ic_launcher, R.drawable.ic_launcher,R.drawable.new_hq,R.drawable.news_dd,R.drawable.foss,R.drawable.ic_launcher,
            R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
            R.drawable.ic_launcher,R.drawable.ic_launcher, R.drawable.startup_xampaperz,R.drawable.startup_junksquare,R.drawable.startup_edusources,
            R.drawable.staionary_jha};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Sponsorsgrid adapter = new Sponsorsgrid(Sponsors.this, a, imageid);
        g = (GridView) findViewById(R.id.sponsor_grid_view);
        g.setAdapter(adapter);
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
