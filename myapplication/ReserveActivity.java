package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReserveActivity extends AppCompatActivity
{
    private EditText keyHospital;
    private Button buttonRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        keyHospital = (EditText)findViewById(R.id.etName);
        buttonRequest = (Button)findViewById(R.id.btnRequest);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.reserve);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.dashboard:
                        Intent d = new Intent(getApplicationContext(), FirstActivity.class); //move from one activity to another
                        startActivity(d);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.map:
                        Intent m = new Intent(getApplicationContext(), MapsActivity.class); //move from one activity to another
                        startActivity(m);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.reserve:
                        return true;
                }
                return false;
            }
        });

        buttonRequest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ReserveActivity.this, FirstActivity.class));
            }
        });
    }
}
