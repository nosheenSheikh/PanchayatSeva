package com.example.ruchi.panchayatseva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class list_servicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_services);
        Button button = (Button) findViewById(R.id.Aadhar);
        button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    startActivity(new Intent(list_servicesActivity.this, aadharActivity.class));

                }

            });

        Button button2 = (Button) findViewById(R.id.pp);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(list_servicesActivity.this, PensionerportalActivity.class));

            }

        });
    }}