package com.laethel.android.hardware_maintenance.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
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
    private Button mIssue_back;
    private Button mIssue_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
        mIssue_banner = (TextView) findViewById(R.id.issue_banner);
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
        mIssue_back = (Button) findViewById(R.id.issue_back);
        mIssue_confirm = (Button) findViewById(R.id.issue_confirm);
    }
}
