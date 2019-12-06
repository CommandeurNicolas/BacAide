package com.example.bacaide.info;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.bacaide.R;

public class InfoActivity extends AppCompatActivity {

    private ImageButton backButton;

    private Button financeButton;
    private Button santeButton;
    private Button logementButton;
    private Button jobsButton;
    private Button foodButton;
    private Button eventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backButton = (ImageButton) findViewById(R.id.button_return);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        financeButton = (Button) findViewById(R.id.button_finance);
        santeButton = (Button) findViewById(R.id.button_sante);
        logementButton = (Button) findViewById(R.id.button_logement);
        jobsButton = (Button) findViewById(R.id.button_jobs);
        foodButton = (Button) findViewById(R.id.button_food);
        eventsButton = (Button) findViewById(R.id.button_events);

        financeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
