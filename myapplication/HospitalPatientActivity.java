package com.example.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class HospitalPatientActivity extends AppCompatActivity {

    private Button patient;
    private Button hospital;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_patient);

        patient = (Button)findViewById(R.id.bigButton);
        hospital = (Button)findViewById(R.id.bigButton2);

        patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent success = new Intent(HospitalPatientActivity.this, MainActivity.class);
                startActivity(success); //login screen
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent success = new Intent(HospitalPatientActivity.this, MainActivity.class);
                startActivity(success); //login screen
            }
        });
    }
}
