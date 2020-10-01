package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
                finish();
            }
        },3000);


    }
}