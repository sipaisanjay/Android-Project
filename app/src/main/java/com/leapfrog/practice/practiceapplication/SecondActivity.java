package com.leapfrog.practice.practiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class    SecondActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("on Start","on Start");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("on Create","on Create");

        Bundle nameData = getIntent().getExtras();
        Bundle passwordData = getIntent().getExtras();

        String nameMessage = nameData.getString("UserName");
        String passwordMessage = passwordData.getString("UserPassword");

        final TextView nameRec = (TextView) findViewById(R.id.getUsername);
        final TextView passwordRec = (TextView) findViewById(R.id.getPassword);



        nameRec.setText(nameMessage);
        passwordRec.setText(passwordMessage);


    }
}
