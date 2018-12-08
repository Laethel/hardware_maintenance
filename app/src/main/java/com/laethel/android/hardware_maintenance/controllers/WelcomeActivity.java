package com.laethel.android.hardware_maintenance.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

public class WelcomeActivity extends AppCompatActivity {

    private TextView mGreetingText;
    private EditText mFirstName;
    private EditText mLastName;
    private EditText mAddress;
    private EditText mCity;
    private EditText mZip;
    private EditText mPhone;
    private Button mStart;

    private String fName;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mGreetingText = (TextView) findViewById(R.id.welcome_text);
        mFirstName = (EditText) findViewById(R.id.welcome_first_name);
        mLastName = (EditText) findViewById(R.id.welcome_last_name);
        mAddress = (EditText) findViewById(R.id.welcome_address);
        mCity = (EditText) findViewById(R.id.welcome_city);
        mZip = (EditText) findViewById(R.id.welcome_zip);
        mPhone = (EditText) findViewById(R.id.welcome_phone);
        mStart = (Button) findViewById(R.id.welcome_start);

        mFirstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLastName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mZip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                checkRequiredFields();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(WelcomeActivity.this, MainActivity.class);
                String fName = mFirstName.getText().toString();
                mainActivity.putExtra("fName", fName);
                startActivity(mainActivity);
            }
        });
    }
    private void checkRequiredFields() {
        if (!mFirstName.getText().toString().isEmpty() && !mLastName.getText().toString().isEmpty()  && !mAddress.getText().toString().isEmpty()
                && !mCity.getText().toString().isEmpty() && !mZip.getText().toString().isEmpty() && !mPhone.getText().toString().isEmpty()) {
            mStart.setEnabled(true);
        } else {
            mStart.setEnabled(false);
        }
    }
}
