package com.example.ruchi.panchayatseva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class servicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);



        Button allservices = findViewById(R.id.allservices);
        allservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(servicesActivity.this,list_servicesActivity.class);
                startActivity(intent);


            }
        });

        Button discussionforum = findViewById(R.id.discussionforum);
        discussionforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(servicesActivity.this,DiscussionforumActivity.class);
                startActivity(intent);


            }
        });
    }


}
