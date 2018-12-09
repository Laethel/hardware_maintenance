package com.laethel.android.hardware_maintenance.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

public class IssueActivity extends AppCompatActivity {

    private TextView mIssue_banner;
    private CheckBox mIssue_checkbox_diagnosis;
    private Button mMainBtHome;
    private Button mMainBtRepairs;
    private Button mMainBtProfile;
    private CheckBox mIssue_checkbox_1;
    private CheckBox mIssue_checkbox_2;
    private CheckBox mIssue_checkbox_3;
    private CheckBox mIssue_checkbox_4;
    private CheckBox mIssue_checkbox_5;
    private CheckBox mIssue_checkbox_6;
    private CheckBox mIssue_checkbox_7;
    private CheckBox mIssue_checkbox_8;
    private CheckBox mIssue_checkbox_9;
    private CheckBox mIssue_checkbox_10;
    private CheckBox mIssue_checkbox_other;
    private EditText mIssue_checkbox_other_text;
    private EditText mIssue_comment;
    private Button mIssue_back;
    private Button mIssue_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
        final Bundle extras = getIntent().getExtras();
        final String issueName = extras.getString("issueName");
        mIssue_banner = (TextView) findViewById(R.id.issue_banner);
        mIssue_banner.setText(issueName);
        mIssue_checkbox_diagnosis = (CheckBox) findViewById(R.id.issue_checkbox_diagnosis);
        mMainBtHome = (Button) findViewById(R.id.main_buttonHome);
        mMainBtRepairs = (Button) findViewById(R.id.main_buttonRepairs);
        mMainBtProfile = (Button) findViewById(R.id.main_buttonProfile);
        mIssue_checkbox_1 = (CheckBox) findViewById(R.id.issue_checkbox_1);
        mIssue_checkbox_2 = (CheckBox) findViewById(R.id.issue_checkbox_2);
        mIssue_checkbox_3 = (CheckBox) findViewById(R.id.issue_checkbox_3);
        mIssue_checkbox_4 = (CheckBox) findViewById(R.id.issue_checkbox_4);
        mIssue_checkbox_5 = (CheckBox) findViewById(R.id.issue_checkbox_5);
        mIssue_checkbox_6 = (CheckBox) findViewById(R.id.issue_checkbox_6);
        mIssue_checkbox_7 = (CheckBox) findViewById(R.id.issue_checkbox_7);
        mIssue_checkbox_8 = (CheckBox) findViewById(R.id.issue_checkbox_8);
        mIssue_checkbox_9 = (CheckBox) findViewById(R.id.issue_checkbox_9);
        mIssue_checkbox_10 = (CheckBox) findViewById(R.id.issue_checkbox_10);
        mIssue_checkbox_other = (CheckBox) findViewById(R.id.issue_checkbox_other);
        mIssue_checkbox_other_text = (EditText) findViewById(R.id.issue_checkbox_other_text);
        mIssue_comment = (EditText) findViewById(R.id.issue_comment);
        mIssue_back = (Button) findViewById(R.id.issue_back);
        mIssue_confirm = (Button) findViewById(R.id.issue_confirm);

        switch(issueName){
            case "System":
                mIssue_checkbox_1.setText("System 1");
                mIssue_checkbox_2.setText("System 2");
                mIssue_checkbox_3.setText("System 3");
                mIssue_checkbox_4.setText("System 4");
                mIssue_checkbox_5.setText("System 5");
                mIssue_checkbox_6.setText("System 6");
                mIssue_checkbox_7.setText("System 7");
                mIssue_checkbox_8.setText("System 8");
                mIssue_checkbox_9.setText("System 9");
                mIssue_checkbox_10.setText("System 10");
                break;
            case "Security":
                mIssue_checkbox_1.setText("Security 1");
                mIssue_checkbox_2.setText("Security 2");
                mIssue_checkbox_3.setText("Security 3");
                mIssue_checkbox_4.setText("Security 4");
                mIssue_checkbox_5.setText("Security 5");
                mIssue_checkbox_6.setText("Security 6");
                mIssue_checkbox_7.setText("Security 7");
                mIssue_checkbox_8.setText("Security 8");
                mIssue_checkbox_9.setText("Security 9");
                mIssue_checkbox_10.setText("Security 10");
                break;
            case "Memory":
                mIssue_checkbox_1.setText("Memory 1");
                mIssue_checkbox_2.setText("Memory 2");
                mIssue_checkbox_3.setText("Memory 3");
                mIssue_checkbox_4.setText("Memory 4");
                mIssue_checkbox_5.setText("Memory 5");
                mIssue_checkbox_6.setText("Memory 6");
                mIssue_checkbox_7.setText("Memory 7");
                mIssue_checkbox_8.setText("Memory 8");
                mIssue_checkbox_9.setText("Memory 9");
                mIssue_checkbox_10.setText("Memory 10");
                break;
        }

        mIssue_checkbox_diagnosis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
            }
        });

        mIssue_checkbox_other.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkRequiredFields();
                checkOtherField();
            }
        });

        mIssue_checkbox_other_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkOtherField();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mIssue_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IssueActivity.this.finish();
            }
        });

    }

    private void checkOtherField(){
        if(!mIssue_checkbox_other_text.getText().toString().isEmpty()){
            mIssue_checkbox_other.setEnabled(true);
        } else {
            mIssue_checkbox_other.setEnabled(false);
        }
    }
    private void checkRequiredFields() {
        if (mIssue_checkbox_diagnosis.isChecked() && (mIssue_checkbox_1.isChecked() || mIssue_checkbox_2.isChecked() || mIssue_checkbox_3.isChecked()
        || mIssue_checkbox_4.isChecked() || mIssue_checkbox_5.isChecked() || mIssue_checkbox_6.isChecked() && mIssue_checkbox_7.isChecked() || mIssue_checkbox_8.isChecked()
        || mIssue_checkbox_9.isChecked() || mIssue_checkbox_10.isChecked() || mIssue_checkbox_other.isChecked())){
            mIssue_confirm.setEnabled(true);
        } else {
            mIssue_confirm.setEnabled(false);
        }
    }
}
