package com.laethel.android.hardware_maintenance.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mMainBanner;
    private Button mMainBt1;
    private Button mMainBt2;
    private Button mMainBt3;
    private Button mMainBt4;
    private Button mMainBt5;
    private Button mMainBt6;
    private Button mMainBt7;
    private Button mMainBt8;
    private Button mMainBt9;
    private Button mMainBt10;
    private Button mMainBtHome;
    private Button mMainBtRepairs;
    private Button mMainBtProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Bundle extras = getIntent().getExtras();
        final String fNameUser = extras.getString("fName");
        mMainBanner = (TextView) findViewById(R.id.main_banner);
        mMainBanner.setText("Welcome " + fNameUser + " ! \n Please select your issue below :)");
        mMainBt1 = (Button) findViewById(R.id.main_button1);
        mMainBt2 = (Button) findViewById(R.id.main_button2);
        mMainBt3 = (Button) findViewById(R.id.main_button3);
        mMainBt4 = (Button) findViewById(R.id.main_button4);
        mMainBt5 = (Button) findViewById(R.id.main_button5);
        mMainBt6 = (Button) findViewById(R.id.main_button6);
        mMainBt7 = (Button) findViewById(R.id.main_button7);
        mMainBt8 = (Button) findViewById(R.id.main_button8);
        mMainBt9 = (Button) findViewById(R.id.main_button9);
        mMainBt10 = (Button) findViewById(R.id.main_button10);
        mMainBtHome = (Button) findViewById(R.id.main_buttonHome);
        mMainBtRepairs = (Button) findViewById(R.id.main_buttonRepairs);
        mMainBtProfile = (Button) findViewById(R.id.main_buttonProfile);

        mMainBt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mMainBt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
