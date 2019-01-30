package com.laethel.android.hardware_maintenance.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

public class RoleActivity extends AppCompatActivity {

    private TextView greetingsText;
    private Button client;
    private Button provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        greetingsText = findViewById(R.id.role_text);
        client = findViewById(R.id.role_client);
        provider = findViewById(R.id.role_provider);

       client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcomeActivity = new Intent(RoleActivity.this, WelcomeActivity.class);
                startActivity(welcomeActivity);
            }
        });

        provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
