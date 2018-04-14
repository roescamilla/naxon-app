package com.dacodes.naxon.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dacodes.naxon.R;
import com.dacodes.naxon.login_signin;

public class launchScreen extends AppCompatActivity {

    private int DURACION_SPLASH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow();
        setContentView(R.layout.activity_launch_screen);


        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(launchScreen.this, login_signin.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);




    }
}
