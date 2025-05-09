package com.roderus.quiz2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Im Intent nachsehen, ob Punkte (von der Feedback-Activity) mitgeliefert werden
        Intent intent = getIntent();
        int p = intent.getIntExtra("pts", -1);
        if (p > 0) {
            // Ja, da waren Punkte im Intent: Diese werden den bisher in Preferences gespeicherten hinzu addiert
            Helper.points = Helper.points + p;
        }

        // Die Punktzahl ausgeben
        TextView scoreView = findViewById(R.id.tv_score);
        String scoreString = "" + Helper.points;
        scoreView.setText(scoreString);
    }

    // Eventhandler für alle Question-Buttons
    public void btn_clicked(View v) {

        Class activityClass;
        int buttonId = v.getId();

        if (buttonId == R.id.btn_question1)
            activityClass = Q1Activity.class;
        else if (buttonId == R.id.btn_question2)
            activityClass = Q2Activity.class;
        else if (buttonId == R.id.btn_question3)
            activityClass = Q3Activity.class;
        else if (buttonId == R.id.btn_question4)
            activityClass = Q4Activity.class;
        else if (buttonId == R.id.btn_question5)
            activityClass = Q5Activity.class;
        else
            // Es wurde ein nicht belegter Button angeklickt -> nicht reagieren
            return;

        // Die gewünschte Frage-Activity wird aufgerufen
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

}