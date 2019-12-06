package com.example.bacaide;

import android.os.Bundle;

import com.example.bacaide.Adapter.ResponseAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.bacaide.R;

public class reponseQuestionActivity extends AppCompatActivity {

    // TODO : Recup question du fragment précédent
    private String question ;
    private TextView questionTV;
    private RecyclerView reponseRV;
    private ResponseAdapter adapterReponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        question = "Pourquoi on fait une appli mobile ?";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reponse_question);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
                displayForm();
            }

        });

        reponseRV = findViewById(R.id.answerRV);
        questionTV = findViewById(R.id.questionPose);

        adapterReponse = new ResponseAdapter(getApplicationContext(),"Combien de temps prend t-il de faire ses devoirs ? ");
        reponseRV.setAdapter(adapterReponse);
        reponseRV.setLayoutManager(new LinearLayoutManager(this));



    }

    private void displayForm() {
    }

}
