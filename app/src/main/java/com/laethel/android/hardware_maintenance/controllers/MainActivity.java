package com.laethel.android.hardware_maintenance.controllers;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mMainBanner;
    private Button mMainBtDiagnosis;
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
    protected String fNameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Bundle extras = getIntent().getExtras();
        if (extras != null){
            this.fNameUser = extras.getString("fName");
        }
        mMainBanner = (TextView) findViewById(R.id.main_banner);
        mMainBanner.setText(getString(R.string.main_banner_text, fNameUser));// Display the welcome message and the name of the user
        mMainBtDiagnosis = (Button) findViewById(R.id.main_buttonDiagnosis);
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

        mMainBtDiagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make a special screen for the diagnosis
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = "Diagnosis";
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt1.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt2.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt3.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt4.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });
        mMainBt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt5.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt6.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt7.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt8.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt9.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent issueActivity = new Intent(MainActivity.this, IssueActivity.class);
                String issueName = mMainBt10.getText().toString();
                issueActivity.putExtra("issueName", issueName);
                startActivity(issueActivity);
            }
        });

        mMainBtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBtRepairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMainBtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
