package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.welcome.customfonts.Button_Poppins_Regular;

public class Login extends AppCompatActivity {
    Button btn_signUp;
    ImageView img_signup;
    Button_Poppins_Regular loginNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_signUp = findViewById(R.id.signup_id);
        img_signup = findViewById(R.id.image_signUp_id);
        loginNow = findViewById(R.id.loginNow);

        loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hm = new Intent(Login.this,Home.class);
                startActivity(hm);
            }
        });

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
            }
        });

        img_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}