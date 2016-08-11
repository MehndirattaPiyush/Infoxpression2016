package com.example.satyamsehgal.infoxpression2016;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
/**
 * Created by satyam sehgal on 5/31/2016.
 */
public class ParseApp extends Application {

    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "AlVkpafv70hyRQZTlqj5YLX1UcvftEvUYUTCocqj", "QNkNO9pXJks4eUNtFajFdWsw60t25yCXPPoIwKIV");
        ParseUser.enableAutomaticUser();
        ParseACL defauAcl = new ParseACL();
        defauAcl.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defauAcl,true);
    }
}

