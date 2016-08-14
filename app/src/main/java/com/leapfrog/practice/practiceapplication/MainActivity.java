package com.leapfrog.practice.practiceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtUsername,txtPassword;
    EditText edtUsername,edtPassword;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("on Create","on Create");
        final EditText edtUsername=(EditText)findViewById(R.id.edtUsername);
        final EditText edtPassword=(EditText)findViewById(R.id.edtPassword);
        Button submitButton=(Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Checking username and password
                if(edtUsername.getText().toString().length()==0){
                    edtUsername.setError("Enter your username");
                }
                if (edtPassword.getText().toString().length() == 0){
                    edtPassword.setError("Enter your password");
                }
                if (edtUsername.getText().toString().length() != 0 && edtPassword.getText().toString().length() != 0){

                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    String userName = edtUsername.getText().toString();
                    String userPassword = edtPassword.getText().toString();
                    i.putExtra("UserName", userName);
                    i.putExtra("UserPassword", userPassword);
                    startActivity(i);
                }
            }
        });

    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.e("on Resume","on Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("on Pause","on Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("on Destroy","on Destroy");
    }
}
