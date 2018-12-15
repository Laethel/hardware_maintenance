package com.laethel.android.hardware_maintenance.controllers;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private TextView mProfileTitleBanner;
    private CircleImageView mProfilePicture;
    private TextView mProfileBannerUserName;
    private TextView mProfileTitle1;
    private TextView mProfileFirstName;
    private TextView mProfileLastName;
    private TextView mProfileAddress;
    private TextView mProfileCity;
    private TextView mProfileZip;
    private TextView mProfilePhone;
    private TextView mProfileMail;
    private Button mProfileBtHome;
    private Button mProfileBtRepairs;
    private Button mProfileBtProfile;

    SharedPreferences mPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mPreferences = getSharedPreferences("userdetails", MODE_PRIVATE);

        mProfileTitleBanner = findViewById(R.id.profile_title_banner);
        mProfilePicture = findViewById(R.id.profile_image);
        mProfileBannerUserName = findViewById(R.id.profile_banner_user_name);
        mProfileTitle1 = findViewById(R.id.profile_personal_info_title);
        mProfileFirstName = findViewById(R.id.profile_first_name);
        mProfileLastName = findViewById(R.id.profile_last_name);
        mProfileAddress = findViewById(R.id.profile_address);
        mProfileCity = findViewById(R.id.profile_city);
        mProfileZip = findViewById(R.id.profile_zip);
        mProfilePhone = findViewById(R.id.profile_phone);
        mProfileMail = findViewById(R.id.profile_mail);
        mProfileBtHome = findViewById(R.id.profile_buttonHome);
        mProfileBtRepairs = findViewById(R.id.profile_buttonRepairs);
        mProfileBtProfile = findViewById(R.id.profile_buttonProfile);

        String userFirstName = mPreferences.getString("PREF_KEY_FIRSTNAME","");
        String userLastName = mPreferences.getString("PREF_KEY_LASTNAME","");
        String userAddress = mPreferences.getString("PREF_KEY_ADDRESS","");
        String userCity = mPreferences.getString("PREF_KEY_CITY","");
        String userZip = mPreferences.getString("PREF_KEY_ZIP","");
        String userPhone = mPreferences.getString("PREF_KEY_PHONE","");
        String userMail = mPreferences.getString("PREF_KEY_MAIL","");
        mProfileBannerUserName.setText(getString(R.string.profile_banner_user_name, userFirstName, userLastName));
        mProfileFirstName.setText(getString(R.string.profile_first_name,userFirstName));
        mProfileLastName.setText(getString(R.string.profile_last_name,userLastName));
        mProfileAddress.setText(getString(R.string.profile_address,userAddress));
        mProfileCity.setText(getString(R.string.profile_city,userCity));
        mProfileZip.setText(getString(R.string.profile_zip,userZip));
        mProfilePhone.setText(getString(R.string.profile_phone,userPhone));
        mProfileMail.setText(getString(R.string.profile_mail,userMail));

        mProfileBtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        mProfileBtRepairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
