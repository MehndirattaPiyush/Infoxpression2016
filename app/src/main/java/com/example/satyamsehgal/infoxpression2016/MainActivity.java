package com.example.satyamsehgal.infoxpression2016;


import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView mt1,mt2,mt3,mt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getId();

        Button instruction = (Button) findViewById(R.id.button_instructions);
        instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obji = new Intent(MainActivity.this, Downloadinstruction.class);
                startActivity(obji);
            }
        });

        Spanned text1 = Html.fromHtml("<b>TECHFEST | USICT</b>");
        mt1.setText(text1);
        Spanned text2 = Html.fromHtml("<b>SEPT 2nd-4th 2016</b>");
        mt2.setText(text2);
        Spanned text3 = Html.fromHtml("<b>CELEBBRATING THE SENSE OF BELONGINESS</b>");
        mt3.setText(text3);
        Spanned text4 = Html.fromHtml("<b>INFOXPRESSION 2016</b>");
        mt4.setText(text4);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_sponsors) {
            Intent obj = new Intent(MainActivity.this, Sponsors.class);
            startActivity(obj);
        } else if (id == R.id.nav_about) {
            Intent obj = new Intent(MainActivity.this, Aboutus.class);
            startActivity(obj);
        } else if (id == R.id.nav_login) {
            Intent obj = new Intent(MainActivity.this, Signup.class);
            startActivity(obj);
        } else if (id == R.id.nav_event) {
            Intent obj = new Intent(MainActivity.this, events.class);
            startActivity(obj);
        }else if (id == R.id.nav_schedule) {
            Intent obj = new Intent(MainActivity.this, Schedules.class);
            startActivity(obj);
        }else if (id == R.id.nav_contact_us) {
            Intent obj = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(obj);
        }else if (id == R.id.nav_team) {
            Intent obj = new Intent(MainActivity.this, Team.class);
            startActivity(obj);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void getId(){
        mt1 = (TextView) findViewById(R.id.maintext1);
        mt2 = (TextView) findViewById(R.id.maintext2);
        mt3 = (TextView) findViewById(R.id.maintext3);
        mt4 = (TextView) findViewById(R.id.minfotext);
    }
}
