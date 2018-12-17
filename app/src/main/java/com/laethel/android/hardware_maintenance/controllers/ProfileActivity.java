package com.laethel.android.hardware_maintenance.controllers;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.laethel.android.hardware_maintenance.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private TextView mProfileTitleBanner;
    private CircleImageView mProfilePicture;
    private TextView mProfileBannerUserName;
    private TextView mProfileTitle1;
    private TextView mProfileFirstName;
    private EditText mProfileFirstNameEdit;
    private TextView mProfileLastName;
    private EditText mProfileLastNameEdit;
    private TextView mProfileAddress;
    private EditText mProfileAddressEdit;
    private TextView mProfileCity;
    private EditText mProfileCityEdit;
    private TextView mProfileZip;
    private EditText mProfileZipEdit;
    private TextView mProfilePhone;
    private EditText mProfilePhoneEdit;
    private TextView mProfileMail;
    private EditText mProfileMailEdit;
    private Button mProfileBtHome;
    private Button mProfileBtRepairs;
    private Button mProfileBtProfile;
    private Button mProfileBtTitle1Edit;
    private Button mProfileBtTitle1Validate;

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
        mProfileFirstNameEdit = findViewById(R.id.profile_first_name_edit);
        mProfileLastNameEdit = findViewById(R.id.profile_last_name_edit);
        mProfileAddressEdit = findViewById(R.id.profile_address_edit);
        mProfileCityEdit = findViewById(R.id.profile_city_edit);
        mProfileZipEdit = findViewById(R.id.profile_zip_edit);
        mProfilePhoneEdit = findViewById(R.id.profile_phone_edit);
        mProfileMailEdit = findViewById(R.id.profile_mail_edit);
        mProfileBtTitle1Edit = findViewById(R.id.profile_title1_edit_button);
        mProfileBtTitle1Validate = findViewById(R.id.profile_title1_confirm_button);
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
        mProfileFirstName.setText(userFirstName);
        mProfileLastName.setText(userLastName);
        mProfileAddress.setText(userAddress);
        mProfileCity.setText(userCity);
        mProfileZip.setText(userZip);
        mProfilePhone.setText(userPhone);
        mProfileMail.setText(userMail);

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

        mProfileBtTitle1Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProfileBtTitle1Validate.setVisibility(View.VISIBLE);
                mProfileBtTitle1Edit.setVisibility(View.INVISIBLE);

                mProfileFirstName.setVisibility(View.INVISIBLE);
                mProfileLastName.setVisibility(View.INVISIBLE);
                mProfileAddress.setVisibility(View.INVISIBLE);
                mProfileCity.setVisibility(View.INVISIBLE);
                mProfileZip.setVisibility(View.INVISIBLE);
                mProfilePhone.setVisibility(View.INVISIBLE);
                mProfileMail.setVisibility(View.INVISIBLE);

                mProfileFirstNameEdit.setVisibility(View.VISIBLE);
                mProfileLastNameEdit.setVisibility(View.VISIBLE);
                mProfileAddressEdit.setVisibility(View.VISIBLE);
                mProfileCityEdit.setVisibility(View.VISIBLE);
                mProfileZipEdit.setVisibility(View.VISIBLE);
                mProfilePhoneEdit.setVisibility(View.VISIBLE);
                mProfileMailEdit.setVisibility(View.VISIBLE);

                mProfileFirstNameEdit.setText(mProfileFirstName.getText().toString());
                mProfileLastNameEdit.setText(mProfileLastName.getText().toString());
                mProfileAddressEdit.setText(mProfileAddress.getText().toString());
                mProfileCityEdit.setText(mProfileCity.getText().toString());
                mProfileZipEdit.setText(mProfileZip.getText().toString());
                mProfilePhoneEdit.setText(mProfilePhone.getText().toString());
                mProfileMailEdit.setText(mProfileMail.getText().toString());

            }
        });

        mProfileBtTitle1Validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProfileBtTitle1Validate.setVisibility(View.INVISIBLE);
                mProfileBtTitle1Edit.setVisibility(View.VISIBLE);

                mProfileFirstName.setVisibility(View.VISIBLE);
                mProfileLastName.setVisibility(View.VISIBLE);
                mProfileAddress.setVisibility(View.VISIBLE);
                mProfileCity.setVisibility(View.VISIBLE);
                mProfileZip.setVisibility(View.VISIBLE);
                mProfilePhone.setVisibility(View.VISIBLE);
                mProfileMail.setVisibility(View.VISIBLE);

                mProfileFirstNameEdit.setVisibility(View.INVISIBLE);
                mProfileLastNameEdit.setVisibility(View.INVISIBLE);
                mProfileAddressEdit.setVisibility(View.INVISIBLE);
                mProfileCityEdit.setVisibility(View.INVISIBLE);
                mProfileZipEdit.setVisibility(View.INVISIBLE);
                mProfilePhoneEdit.setVisibility(View.INVISIBLE);
                mProfileMailEdit.setVisibility(View.INVISIBLE);

                mProfileFirstName.setText(mProfileFirstNameEdit.getText().toString());
                mProfileLastName.setText(mProfileLastNameEdit.getText().toString());
                mProfileAddress.setText(mProfileAddressEdit.getText().toString());
                mProfileCity.setText(mProfileCityEdit.getText().toString());
                mProfileZip.setText(mProfileZipEdit.getText().toString());
                mProfilePhone.setText(mProfilePhoneEdit.getText().toString());
                mProfileMail.setText(mProfileMailEdit.getText().toString());
                mProfileBannerUserName.setText(getString(R.string.profile_banner_user_name, mProfileFirstName.getText().toString(), mProfileLastName.getText().toString()));


                mPreferences.edit().putString("PREF_KEY_FIRSTNAME", mProfileFirstName.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_LASTNAME", mProfileLastName.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_ADDRESS", mProfileAddress.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_CITY", mProfileCity.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_ZIP", mProfileZip.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_PHONE", mProfilePhone.getText().toString()).apply();
                mPreferences.edit().putString("PREF_KEY_MAIL", mProfileMail.getText().toString()).apply();

            }
        });

        mProfileFirstNameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileFirstNameEdit.getText().length()==0)
                {
                    mProfileFirstNameEdit.setError("Please enter a value.");
                }
            }
        });

        mProfileLastNameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileLastNameEdit.getText().length()==0)
                {
                    mProfileLastNameEdit.setError("Please enter a value.");
                }
            }
        });

        mProfileAddressEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileAddressEdit.getText().length()==0)
                {
                    mProfileAddressEdit.setError("Please enter a value.");
                }
            }
        });

        mProfileCityEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileCityEdit.getText().length()==0)
                {
                    mProfileCityEdit.setError("Please enter a value.");
                }
            }
        });

        mProfileZipEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileZipEdit.getText().length()==0)
                {
                    mProfileZipEdit.setError("Please enter a value.");
                }
            }
        });

        mProfilePhoneEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfilePhoneEdit.getText().length()==0)
                {
                    mProfilePhoneEdit.setError("Please enter a value.");
                }
            }
        });

        mProfileMailEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mProfileMailEdit.getText().length()==0)
                {
                    mProfileMailEdit.setError("Please enter a value.");
                }
            }
        });

    }

}
