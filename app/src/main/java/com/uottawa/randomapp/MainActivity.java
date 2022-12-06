package com.uottawa.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText account,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setBtnLogin(View view){
        boolean i=login();
        if(i){
            Intent intent = new Intent(MainActivity.this, UserSession.class);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this,"password wrong",Toast.LENGTH_LONG).show();
        }
    }
    private boolean login(){
        account=findViewById(R.id.account);
        password=findViewById(R.id.password);
        String ac=account.getText().toString();
        String pwd=password.getText().toString();
        return Util.login(ac,pwd);
    }
}