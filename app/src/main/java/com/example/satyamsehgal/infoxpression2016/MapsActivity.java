package com.example.satyamsehgal.infoxpression2016;

import android.app.ProgressDialog;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private TextView name, email, comment;
     private Button b1;
    ProgressDialog mprogress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        getIDS();
        b1.setOnClickListener(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in ggsipu and move the camera
        LatLng ggsipu = new LatLng(28.5946, 77.0208);
        mMap.addMarker(new MarkerOptions().position(ggsipu).title("Marker in GGSIPU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ggsipu));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(28.5946, 77.0208), 14.0f));
    }

    void getIDS() {
        name = (TextView) findViewById(R.id.map_name);
        email = (TextView) findViewById(R.id.map_email);
        comment = (TextView) findViewById(R.id.map_comments);
        b1 = (Button) findViewById(R.id.map_button);
       // pb = (ProgressBar)findViewById(R.id.loadingprogress);

    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.map_button)
        {
            String n = name.getText().toString();
            String e = email.getText().toString();
            String cp = comment.getText().toString();
            if (n.equals("") || e.equals("") || cp.equals("")) {
                Toast.makeText(getApplicationContext(), "Please fill the details", Toast.LENGTH_SHORT).show();
            }
            else if(!isValidEmail(e)){email.setError("enter the valid email id");}
            else
            {
                mprogress = new ProgressDialog(v.getContext());
                mprogress.setCancelable(true);
               // mprogress.setIndeterminate(true);
                mprogress.setMessage("Registering comment...");
                mprogress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                mprogress.setProgress(0);
                mprogress.setMax(500);
                mprogress.show();

                ParseObject obj= new ParseObject("Comments_of_person");
                obj.put("name",n);
                obj.saveInBackground();
                obj.put("email",e);
                obj.saveInBackground();
                obj.put("comment",cp);
                obj.saveInBackground();

                mprogress.dismiss();
                Toast.makeText(getApplicationContext(), "Your Response has been recorded", Toast.LENGTH_SHORT).show();
                name.setText("");
                email.setText("");
                comment.setText("");

            }
        }
    }
}
