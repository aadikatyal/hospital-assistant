package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SuccessfulLoginActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_login);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent nextPage = new Intent(SuccessfulLoginActivity.this, FirstActivity.class); //splash screen
                startActivity(nextPage);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
