package com.example.satyamsehgal.infoxpression2016;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import Adapters.ListviewAdapter;

public class Downloadinstruction extends AppCompatActivity {
    ListView list;
    String[] instructions = {"Infox Brief Brochure[PDF]", "Infox Book[PDF]", "Posters", "Schedule[PDF]",
            "Letter Addressing Potential Sponsor", "Letter Addressing Government Organizations",
            "Letter Addressing Organizations and Groups", "Letter Addressing Principal", "Letter Addressing Students Club"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloadinstruction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListviewAdapter adapter = new ListviewAdapter(this, instructions);
        list = (ListView) findViewById(R.id.download_listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(Downloadinstruction.this, "Downloading Brochure... ", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(Downloadinstruction.this, "Downloading Infox Book... ", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(Downloadinstruction.this, "Downloading Posters... ", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(Downloadinstruction.this, "Downloading Schedule... ", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        String urltechspace = "http://infoxpression.in/letters/sponsors.docx";
                        Intent obj1 = new Intent(Intent.ACTION_VIEW);
                        obj1.setData(Uri.parse(urltechspace));
                        startActivity(obj1);
                        Toast.makeText(Downloadinstruction.this, "Downloading Letter Addressing Potential...", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        String gvt = "http://infoxpression.in/letters/govtorg.docx";
                        Intent obj5 = new Intent(Intent.ACTION_VIEW);
                        obj5.setData(Uri.parse(gvt));
                        startActivity(obj5);
                        Toast.makeText(Downloadinstruction.this, " Downloading Letter Addressing Government Organizations", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        String grps = " http://infoxpression.in/letters/groups.docx";
                        Intent obj6 = new Intent(Intent.ACTION_VIEW);
                        obj6.setData(Uri.parse(grps));
                        startActivity(obj6);
                        Toast.makeText(Downloadinstruction.this, "Downloading Letter Addressing Organizations and Groups ", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        String principal = "http://infoxpression.in/letters/principal.docx";
                        Intent obj7 = new Intent(Intent.ACTION_VIEW);
                        obj7.setData(Uri.parse(principal));
                        startActivity(obj7);
                        Toast.makeText(Downloadinstruction.this, "Downloading Letter Addressing Principal", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        String st = "http://infoxpression.in/letters/Clubs.docs";
                        Intent obj8 = new Intent(Intent.ACTION_VIEW);
                        obj8.setData(Uri.parse(st));
                        startActivity(obj8);
                        Toast.makeText(Downloadinstruction.this, "Downloading Letter Addressing Student Clubs ", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

}
