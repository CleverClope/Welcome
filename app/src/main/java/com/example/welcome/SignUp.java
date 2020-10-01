package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.welcome.customfonts.Button_Poppins_Regular;

public class SignUp extends AppCompatActivity {
    Button_Poppins_Regular back2loginn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        back2loginn = findViewById(R.id.back2login);

        back2loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back2 = new Intent (SignUp.this,Login.class);
                startActivity(back2);
            }
        });
    }
}