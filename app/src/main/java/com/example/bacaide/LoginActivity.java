package com.example.bacaide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private Button loginButton, subButton, guestButton;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Récupération des composants
        loginButton = findViewById(R.id.connexionButton);
        subButton = findViewById(R.id.inscriptionButton);
        guestButton = findViewById(R.id.guestButton);
        email = findViewById(R.id.email);
        password =findViewById(R.id.password);

        loginButton.setOnClickListener ((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }
        ));

        subButton.setOnClickListener ((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SubActivity.class);
                startActivity(intent);
            }
        }
        ));
    }
}