package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FirstActivity extends AppCompatActivity {

    private ImageView COVID;
    private ImageView Profile;
    private ImageView Map;
    private ImageView Reserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.dashboard:
                        return true;
                    case R.id.map:
                        Intent m = new Intent(getApplicationContext(), MapsActivity.class); //move from one activity to another
                        startActivity(m);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.reserve:
                        Intent r = new Intent(getApplicationContext(), ReserveActivity.class); //move from one activity to another
                        startActivity(r);
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });



        COVID = (ImageView) findViewById(R.id.ivCOVID);
        Profile = (ImageView) findViewById(R.id.ivProfile);
        Map = (ImageView) findViewById(R.id.ivMap);
        Reserve = (ImageView) findViewById(R.id.ivReserve);

        COVID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(FirstActivity.this, COVIDActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(FirstActivity.this, ProfileActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(FirstActivity.this, MapsActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(FirstActivity.this, ReserveActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
    }
}
