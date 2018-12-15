package com.laethel.android.hardware_maintenance.controllers;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
    private TextView mIssue_text_diagnosis;
    private Button mIssueBtHome;
    private Button mIssueBtRepairs;
    private Button mIssueBtProfile;
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

    protected String issueName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
        final Bundle extras = getIntent().getExtras();
        if (extras != null){
            this.issueName = extras.getString("issueName");
        }
        mIssue_banner = findViewById(R.id.issue_banner);
        mIssue_banner.setText(issueName);
        mIssue_checkbox_diagnosis = findViewById(R.id.issue_checkbox_diagnosis);
        mIssue_text_diagnosis = findViewById(R.id.issue_text_diagnosis);
        mIssueBtHome = findViewById(R.id.issue_buttonHome);
        mIssueBtRepairs = findViewById(R.id.issue_buttonRepairs);
        mIssueBtProfile = findViewById(R.id.issue_buttonProfile);
        mIssue_checkbox_1 = findViewById(R.id.issue_checkbox_1);
        mIssue_checkbox_2 = findViewById(R.id.issue_checkbox_2);
        mIssue_checkbox_3 = findViewById(R.id.issue_checkbox_3);
        mIssue_checkbox_4 = findViewById(R.id.issue_checkbox_4);
        mIssue_checkbox_5 = findViewById(R.id.issue_checkbox_5);
        mIssue_checkbox_6 = findViewById(R.id.issue_checkbox_6);
        mIssue_checkbox_7 = findViewById(R.id.issue_checkbox_7);
        mIssue_checkbox_8 = findViewById(R.id.issue_checkbox_8);
        mIssue_checkbox_9 = findViewById(R.id.issue_checkbox_9);
        mIssue_checkbox_10 = findViewById(R.id.issue_checkbox_10);
        mIssue_checkbox_other = findViewById(R.id.issue_checkbox_other);
        mIssue_checkbox_other_text = findViewById(R.id.issue_checkbox_other_text);
        mIssue_comment = findViewById(R.id.issue_comment);
        mIssue_back = findViewById(R.id.issue_back);
        mIssue_confirm = findViewById(R.id.issue_confirm);
        checkRequiredFields();
        checkOtherField();

        switch(issueName){
            case "Diagnosis":
                mIssue_checkbox_diagnosis.setVisibility(View.INVISIBLE);
                mIssue_text_diagnosis.setVisibility(View.VISIBLE);
                mIssue_comment.setHint(R.string.diagnosis_comment);
                mIssue_checkbox_1.setText(R.string.main_bt1);
                mIssue_checkbox_2.setText(R.string.main_bt2);
                mIssue_checkbox_3.setText(R.string.main_bt3);
                mIssue_checkbox_4.setText(R.string.main_bt4);
                mIssue_checkbox_5.setText(R.string.main_bt5);
                mIssue_checkbox_6.setText(R.string.main_bt6);
                mIssue_checkbox_7.setText(R.string.main_bt7);
                mIssue_checkbox_8.setText(R.string.main_bt8);
                mIssue_checkbox_9.setText(R.string.main_bt9);
                mIssue_checkbox_10.setText(R.string.main_bt10);
                break;
            case "System":
                mIssue_checkbox_1.setText(R.string.system_issue_1);
                mIssue_checkbox_2.setText(R.string.system_issue_2);
                mIssue_checkbox_3.setText(R.string.system_issue_3);
                mIssue_checkbox_4.setText(R.string.system_issue_4);
                mIssue_checkbox_5.setText(R.string.system_issue_5);
                mIssue_checkbox_6.setText(R.string.system_issue_6);
                mIssue_checkbox_7.setText(R.string.system_issue_7);
                mIssue_checkbox_8.setText(R.string.system_issue_8);
                mIssue_checkbox_9.setText(R.string.system_issue_9);
                mIssue_checkbox_10.setText(R.string.system_issue_10);
                break;
            case "Security":
                mIssue_checkbox_1.setText(R.string.security_issue_1);
                mIssue_checkbox_2.setText(R.string.security_issue_2);
                mIssue_checkbox_3.setText(R.string.security_issue_3);
                mIssue_checkbox_4.setText(R.string.security_issue_4);
                mIssue_checkbox_5.setText(R.string.security_issue_5);
                mIssue_checkbox_6.setText(R.string.security_issue_6);
                mIssue_checkbox_7.setText(R.string.security_issue_7);
                mIssue_checkbox_8.setText(R.string.security_issue_8);
                mIssue_checkbox_9.setText(R.string.security_issue_9);
                mIssue_checkbox_10.setText(R.string.security_issue_10);
                break;
            case "Memory":
                mIssue_checkbox_1.setText(R.string.memory_issue_1);
                mIssue_checkbox_2.setText(R.string.memory_issue_2);
                mIssue_checkbox_3.setText(R.string.memory_issue_3);
                mIssue_checkbox_4.setText(R.string.memory_issue_4);
                mIssue_checkbox_5.setText(R.string.memory_issue_5);
                mIssue_checkbox_6.setText(R.string.memory_issue_6);
                mIssue_checkbox_7.setText(R.string.memory_issue_7);
                mIssue_checkbox_8.setText(R.string.memory_issue_8);
                mIssue_checkbox_9.setText(R.string.memory_issue_9);
                mIssue_checkbox_10.setText(R.string.memory_issue_10);
                break;
            case "Screen":
                mIssue_checkbox_1.setText(R.string.screen_issue_1);
                mIssue_checkbox_2.setText(R.string.screen_issue_2);
                mIssue_checkbox_3.setText(R.string.screen_issue_3);
                mIssue_checkbox_4.setText(R.string.screen_issue_4);
                mIssue_checkbox_5.setText(R.string.screen_issue_5);
                mIssue_checkbox_6.setText(R.string.screen_issue_6);
                mIssue_checkbox_7.setText(R.string.screen_issue_7);
                mIssue_checkbox_8.setText(R.string.screen_issue_8);
                mIssue_checkbox_9.setText(R.string.screen_issue_9);
                mIssue_checkbox_10.setText(R.string.screen_issue_10);
                break;
            case "Peripherals (Mouse, keyboard)":
                mIssue_checkbox_1.setText(R.string.peripherals_issue_1);
                mIssue_checkbox_2.setText(R.string.peripherals_issue_2);
                mIssue_checkbox_3.setText(R.string.peripherals_issue_3);
                mIssue_checkbox_4.setText(R.string.peripherals_issue_4);
                mIssue_checkbox_5.setText(R.string.peripherals_issue_5);
                mIssue_checkbox_6.setText(R.string.peripherals_issue_6);
                mIssue_checkbox_7.setText(R.string.peripherals_issue_7);
                mIssue_checkbox_8.setText(R.string.peripherals_issue_8);
                mIssue_checkbox_9.setText(R.string.peripherals_issue_9);
                mIssue_checkbox_10.setText(R.string.peripherals_issue_10);
                break;
            case "Battery":
                mIssue_checkbox_1.setText(R.string.battery_issue_1);
                mIssue_checkbox_2.setText(R.string.battery_issue_2);
                mIssue_checkbox_3.setText(R.string.battery_issue_3);
                mIssue_checkbox_4.setText(R.string.battery_issue_4);
                mIssue_checkbox_5.setText(R.string.battery_issue_5);
                mIssue_checkbox_6.setText(R.string.battery_issue_6);
                mIssue_checkbox_7.setText(R.string.battery_issue_7);
                mIssue_checkbox_8.setText(R.string.battery_issue_8);
                mIssue_checkbox_9.setText(R.string.battery_issue_9);
                mIssue_checkbox_10.setText(R.string.battery_issue_10);
                break;
            case "Button 7":
                mIssue_checkbox_1.setText(R.string.button7_issue_1);
                mIssue_checkbox_2.setText(R.string.button7_issue_2);
                mIssue_checkbox_3.setText(R.string.button7_issue_3);
                mIssue_checkbox_4.setText(R.string.button7_issue_4);
                mIssue_checkbox_5.setText(R.string.button7_issue_5);
                mIssue_checkbox_6.setText(R.string.button7_issue_6);
                mIssue_checkbox_7.setText(R.string.button7_issue_7);
                mIssue_checkbox_8.setText(R.string.button7_issue_8);
                mIssue_checkbox_9.setText(R.string.button7_issue_9);
                mIssue_checkbox_10.setText(R.string.button7_issue_10);
                break;
            case "Button 8":
                mIssue_checkbox_1.setText(R.string.button8_issue_1);
                mIssue_checkbox_2.setText(R.string.button8_issue_2);
                mIssue_checkbox_3.setText(R.string.button8_issue_3);
                mIssue_checkbox_4.setText(R.string.button8_issue_4);
                mIssue_checkbox_5.setText(R.string.button8_issue_5);
                mIssue_checkbox_6.setText(R.string.button8_issue_6);
                mIssue_checkbox_7.setText(R.string.button8_issue_7);
                mIssue_checkbox_8.setText(R.string.button8_issue_8);
                mIssue_checkbox_9.setText(R.string.button8_issue_9);
                mIssue_checkbox_10.setText(R.string.button8_issue_10);
                break;
            case "Button 9":
                mIssue_checkbox_1.setText(R.string.button9_issue_1);
                mIssue_checkbox_2.setText(R.string.button9_issue_2);
                mIssue_checkbox_3.setText(R.string.button9_issue_3);
                mIssue_checkbox_4.setText(R.string.button9_issue_4);
                mIssue_checkbox_5.setText(R.string.button9_issue_5);
                mIssue_checkbox_6.setText(R.string.button9_issue_6);
                mIssue_checkbox_7.setText(R.string.button9_issue_7);
                mIssue_checkbox_8.setText(R.string.button9_issue_8);
                mIssue_checkbox_9.setText(R.string.button9_issue_9);
                mIssue_checkbox_10.setText(R.string.button9_issue_10);
                break;
            case "Button 10":
                mIssue_checkbox_1.setText(R.string.button10_issue_1);
                mIssue_checkbox_2.setText(R.string.button10_issue_2);
                mIssue_checkbox_3.setText(R.string.button10_issue_3);
                mIssue_checkbox_4.setText(R.string.button10_issue_4);
                mIssue_checkbox_5.setText(R.string.button10_issue_5);
                mIssue_checkbox_6.setText(R.string.button10_issue_6);
                mIssue_checkbox_7.setText(R.string.button10_issue_7);
                mIssue_checkbox_8.setText(R.string.button10_issue_8);
                mIssue_checkbox_9.setText(R.string.button10_issue_9);
                mIssue_checkbox_10.setText(R.string.button10_issue_10);
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

        mIssue_comment.addTextChangedListener(new TextWatcher() {
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

        mIssue_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IssueActivity.this.finish();
            }
        });

        mIssueBtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IssueActivity.this.finish();
            }
        });

        mIssueBtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileActivity = new Intent(IssueActivity.this, ProfileActivity.class);
                startActivity(profileActivity);
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
        if ((mIssue_checkbox_diagnosis.isChecked() || (mIssue_text_diagnosis.getVisibility()==View.VISIBLE&& !mIssue_comment.getText().toString().isEmpty()))
                && (mIssue_checkbox_1.isChecked() || mIssue_checkbox_2.isChecked() || mIssue_checkbox_3.isChecked()
                || mIssue_checkbox_4.isChecked() || mIssue_checkbox_5.isChecked() || mIssue_checkbox_6.isChecked() && mIssue_checkbox_7.isChecked() || mIssue_checkbox_8.isChecked()
                || mIssue_checkbox_9.isChecked() || mIssue_checkbox_10.isChecked() || mIssue_checkbox_other.isChecked())){
            mIssue_confirm.setEnabled(true);
        } else {
            mIssue_confirm.setEnabled(false);
        }
    }

}
