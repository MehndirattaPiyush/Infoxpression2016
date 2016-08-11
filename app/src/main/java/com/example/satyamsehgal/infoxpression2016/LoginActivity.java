package com.example.satyamsehgal.infoxpression2016;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseUser;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    // UI references.
    private EditText mEmailView;
    private EditText mPasswordView;
    ProgressDialog mprogress;
    private View mLoginFormView;
    private Button b1;
    private TextView signuptext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        // Set up the login form.
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); //to hide onscreen keyboard auto popup0
        mEmailView = (EditText) findViewById(R.id.login_email);
        mPasswordView = (EditText) findViewById(R.id.login_password);
        b1 = (Button) findViewById(R.id.btn_login);
        signuptext = (TextView) findViewById(R.id.link_signup);
        b1.setOnClickListener(this);
        signuptext.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.link_signup:
                Intent objt = new Intent(LoginActivity.this, Signup.class);
                startActivity(objt);
                break;
            case R.id.btn_login:
                int nflag = 0;
                int pflag = 0;
                String n = mEmailView.getText().toString();
                String p = mPasswordView.getText().toString();

                if (n.equals("")) nflag = 1;
                if (p.equals("")) pflag = 1;

                if (nflag == 1 && pflag == 1) {
                    mEmailView.setError("enter the email");
                    // Toast.makeText(getActivity(),"Please enter the username and password", Toast.LENGTH_SHORT).show();
                    mPasswordView.setError("enter the password");

                } else if (nflag == 0 && pflag == 1) mPasswordView.setError("enter the password");
                else if (nflag == 1 && pflag == 0) mEmailView.setError("enter the username");
                else if (nflag == 0 && pflag == 0) {
                    mprogress = new ProgressDialog(v.getContext());
                    mprogress.setCancelable(true);
                    mprogress.setMessage("Signing In...");
                    mprogress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    mprogress.setProgress(0);
                    mprogress.setMax(100);
                    mprogress.show();


                    ParseUser.logInInBackground(n, p, new LogInCallback() {
                        @Override
                        public void done(ParseUser parseUser, com.parse.ParseException e) {
                            if (parseUser != null) {
                                mprogress.dismiss();
                                Intent tl = new Intent(LoginActivity.this, MainActivity.class);
                                tl.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                tl.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                tl.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                startActivity(tl);
                            } else {
                                mprogress.dismiss();
                                Toast.makeText(getApplication(), "This User doesn't exist.Please signup ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}

