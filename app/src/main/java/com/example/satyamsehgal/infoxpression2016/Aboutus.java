package com.example.satyamsehgal.infoxpression2016;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity implements View.OnClickListener {
    private TextView t1, t2;
    private Button b1, b2, b3, b4, b5;
    ScrollView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        t1 = (TextView) findViewById(R.id.about_heading);
        Spanned text1 = Html.fromHtml("<b>About InfoXpression</b>");
        t1.setText(text1);
        t2 = (TextView) findViewById(R.id.about_text1);
        Spanned text = Html.fromHtml("InfoXpression is the annual techno-cultural fest of Guru Gobind Singh Indraprastha University oraganized by USICT." +
                " It is the biggest technical extravaganza held at Guru Gobind Singh Indraprastha University," +
                "and involves an active participation of students from over 250 colleges of north India.An exhilarating voyage of technical know-how, InfoXpression focuses on the promotion of technology and innovation. " +
                "<br><br>It gives you a chance to culminate new ideas and showcase your technical expertise." +
                "The fest is a three day grandeur which involves a series of competitions, workshops and guest lectures by " +
                "some eminent personalities.It will be a perfect blend of entertainment and technology with the aim of transformation and empowerment of the society.");
        t2.setText(text);
        getbuttonid();
        setclicklistener();
    }

    /*public boolean arrowScroll(){
        return true;
    }*/
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

    public void getbuttonid() {
        b1 = (Button) findViewById(R.id.usict);
        b2 = (Button) findViewById(R.id.techspace);
        b3 = (Button) findViewById(R.id.ecell);
        b4 = (Button) findViewById(R.id.ieee);
        b5 = (Button) findViewById(R.id.ieeestudent);
    }

    public void setclicklistener() {
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.usict:
                String urlusict = "http:ipu.ac.in/usict";
                Intent obj = new Intent(Intent.ACTION_VIEW);
                obj.setData(Uri.parse(urlusict));
                startActivity(obj);
                break;
            case R.id.techspace:
                String urltechspace = "http://www.techspace.club";
                Intent obj1 = new Intent(Intent.ACTION_VIEW);
                obj1.setData(Uri.parse(urltechspace));
                startActivity(obj1);
                break;
            case R.id.ecell:
                String urlecell = "http://www.techspace.club/ecell.php";
                Intent obj2 = new Intent(Intent.ACTION_VIEW);
                obj2.setData(Uri.parse(urlecell));
                startActivity(obj2);
                break;
            case R.id.ieee:
                String urlieee = "https://www.facebook.com/groups/ieee.usict/";
                Intent obj3 = new Intent(Intent.ACTION_VIEW);
                obj3.setData(Uri.parse(urlieee));
                startActivity(obj3);
                break;
            case R.id.ieeestudent:
                String urliete = "https://www.facebook.com/ISF-IETE-Students-Forum-USICT-889561247766520/?fref=ts";
                Intent obj4 = new Intent(Intent.ACTION_VIEW);
                obj4.setData(Uri.parse(urliete));
                startActivity(obj4);
                break;

        }
    }
}
