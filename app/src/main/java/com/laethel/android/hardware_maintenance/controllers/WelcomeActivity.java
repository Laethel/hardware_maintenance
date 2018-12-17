package com.laethel.android.hardware_maintenance.controllers;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import com.laethel.android.hardware_maintenance.models.User;

public class WelcomeActivity extends AppCompatActivity {

    private TextView mGreetingText;
    private EditText mFirstName;
    private EditText mLastName;
    private EditText mAddress;
    private EditText mCity;
    private EditText mZip;
    private EditText mPhone;
    private EditText mMail;
    private Button mStart;
    private User mUser;
    SharedPreferences mPreferences;

    public static final String PREF_KEY_FIRSTNAME = "PREF_KEY_FIRSTNAME";
    public static final String PREF_KEY_LASTNAME = "PREF_KEY_LASTNAME";
    public static final String PREF_KEY_ADDRESS = "PREF_KEY_ADDRESS";
    public static final String PREF_KEY_CITY = "PREF_KEY_CITY";
    public static final String PREF_KEY_ZIP = "PREF_KEY_ZIP";
    public static final String PREF_KEY_PHONE = "PREF_KEY_PHONE";
    public static final String PREF_KEY_MAIL = "PREF_KEY_MAIL";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mUser = new User();
        mPreferences = getSharedPreferences("userdetails",MODE_PRIVATE);
        mGreetingText = findViewById(R.id.welcome_text);
        mFirstName = findViewById(R.id.welcome_first_name);
        mLastName = findViewById(R.id.welcome_last_name);
        mAddress = findViewById(R.id.welcome_address);
        mCity = findViewById(R.id.welcome_city);
        mZip = findViewById(R.id.welcome_zip);
        mPhone = findViewById(R.id.welcome_phone);
        mMail = findViewById(R.id.welcome_mail);
        mStart = findViewById(R.id.welcome_start);
        checkExistingUser();
        checkRequiredFields();
        detectBlanks();
        
        mFirstName.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mFirstName.getText().length()==0)
                {
                    mFirstName.setError("Please enter a value.");
                }
            }
        });

        mLastName.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mLastName.getText().length()==0)
                {
                    mLastName.setError("Please enter a value.");
                }
            }
        });

        mAddress.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mAddress.getText().length()==0)
                {
                    mAddress.setError("Please enter a value.");
                }
            }
        });

        mCity.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mCity.getText().length()==0)
                {
                    mCity.setError("Please enter a value.");
                }
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
                checkRequiredFields();
                if(mZip.getText().length()==0)
                {
                    mZip.setError("Please enter a value.");
                }
            }
        });

        mPhone.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mPhone.getText().length()==0)
                {
                    mPhone.setError("Please enter a value.");
                }
            }
        });

        mMail.addTextChangedListener(new TextWatcher() {
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
                checkRequiredFields();
                if(mMail.getText().length()==0)
                {
                    mMail.setError("Please enter a value.");
                }
            }
        });

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = mFirstName.getText().toString();
                String lastName = mLastName.getText().toString();
                String address = mAddress.getText().toString();
                String city = mCity.getText().toString();
                String zip = mZip.getText().toString();
                String phone = mPhone.getText().toString();
                String mail = mMail.getText().toString();
                mUser.setmFirstName(firstName);
                mUser.setmLastName(lastName);
                mUser.setmAddress(address);
                mUser.setmCity(city);
                mUser.setmZip(zip);
                mUser.setmPhone(phone);
                mUser.setmMail(mail);
                mPreferences.edit().putString(PREF_KEY_FIRSTNAME, mUser.getmFirstName()).apply();
                mPreferences.edit().putString(PREF_KEY_LASTNAME, mUser.getmLastName()).apply();
                mPreferences.edit().putString(PREF_KEY_ADDRESS, mUser.getmAddress()).apply();
                mPreferences.edit().putString(PREF_KEY_CITY, mUser.getmCity()).apply();
                mPreferences.edit().putString(PREF_KEY_ZIP, mUser.getmZip()).apply();
                mPreferences.edit().putString(PREF_KEY_PHONE, mUser.getmPhone()).apply();
                mPreferences.edit().putString(PREF_KEY_MAIL, mUser.getmMail()).apply();
                Intent mainActivity = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
    private void checkRequiredFields() {
        if (!mFirstName.getText().toString().isEmpty() && !mLastName.getText().toString().isEmpty()  && !mAddress.getText().toString().isEmpty()
                && !mCity.getText().toString().isEmpty() && !mZip.getText().toString().isEmpty() && !mPhone.getText().toString().isEmpty()
                && !mMail.getText().toString().isEmpty()) {
            mStart.setEnabled(true);
        } else {
            mStart.setEnabled(false);
        }
    }

    private void checkExistingUser(){

        String fName = mPreferences.getString(PREF_KEY_FIRSTNAME, null);
        if (fName != null){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Hello " +mPreferences.getString(PREF_KEY_FIRSTNAME, null) + " !")
                    .setMessage("Welcome back :)")
                    .setPositiveButton("GO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent mainActivity = new Intent(WelcomeActivity.this, MainActivity.class);
                            mainActivity.putExtra("firstName", mPreferences.getString(PREF_KEY_FIRSTNAME, null));
                            startActivity(mainActivity);
                        }
                    })
                    .setNegativeButton("I'm not " + mPreferences.getString(PREF_KEY_FIRSTNAME, null), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            mUser.setmFirstName(null);
                            mUser.setmLastName(null);
                            mUser.setmAddress(null);
                            mUser.setmCity(null);
                            mUser.setmZip(null);
                            mUser.setmPhone(null);
                            mUser.setmMail(null);
                            mPreferences.edit().putString(PREF_KEY_FIRSTNAME, mUser.getmFirstName()).apply();
                            mPreferences.edit().putString(PREF_KEY_LASTNAME, mUser.getmLastName()).apply();
                            mPreferences.edit().putString(PREF_KEY_ADDRESS, mUser.getmAddress()).apply();
                            mPreferences.edit().putString(PREF_KEY_CITY, mUser.getmCity()).apply();
                            mPreferences.edit().putString(PREF_KEY_ZIP, mUser.getmZip()).apply();
                            mPreferences.edit().putString(PREF_KEY_PHONE, mUser.getmPhone()).apply();
                            mPreferences.edit().putString(PREF_KEY_MAIL, mUser.getmMail()).apply();
                        }
                    })
                    .create()
                    .show();
        }
    }

    private void detectBlanks(){
        if(mFirstName.getText().length()==0) {
            mFirstName.setError("Please enter a value.");
        }
        if(mLastName.getText().length()==0) {
            mLastName.setError("Please enter a value.");
        }
        if(mAddress.getText().length()==0) {
            mAddress.setError("Please enter a value.");
        }
        if(mCity.getText().length()==0) {
            mCity.setError("Please enter a value.");
        }
        if(mZip.getText().length()==0) {
            mZip.setError("Please enter a value.");
        }
        if(mPhone.getText().length()==0) {
            mPhone.setError("Please enter a value.");
        }
        if(mMail.getText().length()==0) {
            mMail.setError("Please enter a value.");
        }
    }
}
