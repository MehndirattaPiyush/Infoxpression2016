package com.example.satyamsehgal.infoxpression2016;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import Adapters.Customgrid;
import Adapters.TeamAdapter;

public class Team extends AppCompatActivity {

    GridView g;
    String[] t={"App Developer"};
    String[] t1={"Satyam Sehgal"};
    String[] t2={"Mobile no.  +919654759593"};

    int[] imageid={R.drawable.satyam};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TeamAdapter adapter = new TeamAdapter(Team.this, t,t1, imageid,t2);
        g = (GridView) findViewById(R.id.team_grid_view);
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
