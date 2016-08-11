package com.example.satyamsehgal.infoxpression2016;

;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.parse.ParseObject;

public class Signup extends AppCompatActivity implements View.OnClickListener {

    private  Button b1;
    private EditText username, email, collegename,phone;
    private Spinner course,eventname,branch;
    //ProgressDialog mprogress1;
    private ParseObject myobject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); //to hide onscreen keyboard auto popup0
        getId();
        b1.setOnClickListener(this);

        myobject =new ParseObject("Entries");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_events, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml
        return super.onOptionsItemSelected(item);
    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int flagcp = 1, flag = 1;
        if (id == R.id.signup_button) {
            String name = username.getText().toString();
            String mobile = phone.getText().toString();
            String college= collegename.getText().toString();
            String em = email.getText().toString();
            String event = eventname.getSelectedItem().toString();
            String cou = course.getSelectedItem().toString();
            String bra = branch.getSelectedItem().toString();


            if (name.equals("") || mobile.equals("") || college.equals("")|| em.equals("")) {
                Toast.makeText(getApplicationContext(), "Please complete the sign up form", Toast.LENGTH_SHORT).show();
            }else  if(!isValidEmail(em)){
                email.setError("enter the valid email");
            }else if (mobile.length()!=10){
                phone.setError("enter the valid no.");
            }else if(!checkinternet()) {
                Toast.makeText(getApplicationContext(), "No Internet Connection ", Toast.LENGTH_SHORT).show();
            }
            else if (flagcp == 1 && flag == 1) {

             /*   mprogress1 = new ProgressDialog(v.getContext());
                mprogress1.setCancelable(true);
                mprogress1.setIndeterminate(true);
                mprogress1.setMessage("Registering...");
                mprogress1.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                mprogress1.setProgress(0);
                mprogress1.setMax(100);
                mprogress1.show();

              */
                //ParseObject obj= new ParseObject("Comments");
                String comp = event;
                comp=comp.replaceAll("\\s+","");
                myobject = new ParseObject(comp);

                myobject.put("Name", name);
                myobject.saveInBackground();

                myobject.put("College name", college);
                myobject.saveInBackground();

                myobject.put("Mobile No.", mobile);
                myobject.saveInBackground();

                myobject.put("Email", em);
                myobject.saveInBackground();

                myobject.put("Course", cou);
                myobject.saveInBackground();

                myobject.put("Branch", bra);
                myobject.saveInBackground();

                myobject.put("Event", event);
                myobject.saveInBackground();
               // mprogress1.dismiss();

                Toast.makeText(getApplicationContext(), "Your have registered successfully for " + event, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Signup.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }
    }

    public  boolean checkinternet()
    {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected()))
            return true;
        else
            return false;
    }

    public void getId() {
        username = (EditText) findViewById(R.id.signup_name);
        email = (EditText) findViewById(R.id.signup_email);
        phone = (EditText) findViewById(R.id.signup_mobileno);
        collegename = (EditText) findViewById(R.id.signup_college);
        course=(Spinner)findViewById(R.id.signup_spinner_course);
        branch=(Spinner)findViewById(R.id.signup_spinner_branch);
        eventname=(Spinner)findViewById(R.id.signup_spinner_event);
        b1 = (Button) findViewById(R.id.signup_button);
    }

}
