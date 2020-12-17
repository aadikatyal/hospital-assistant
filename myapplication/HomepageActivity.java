package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomepageActivity extends AppCompatActivity {

    private ImageView COVID;
    private ImageView Profile;
    private ImageView Map;
    private ImageView Reserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        COVID = (ImageView) findViewById(R.id.ivCOVID);
        Profile = (ImageView) findViewById(R.id.ivProfile);
        Map = (ImageView) findViewById(R.id.ivMap);
        Reserve = (ImageView) findViewById(R.id.ivReserve);

        COVID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(HomepageActivity.this, COVIDActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(HomepageActivity.this, ProfileActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(HomepageActivity.this, MapsActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
        Reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent success = new Intent(HomepageActivity.this, MainActivity.class); //move from one activity to another
                startActivity(success); //normal screen
            }
        });
    }
}
