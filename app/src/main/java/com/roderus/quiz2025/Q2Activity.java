package com.roderus.quiz2025;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Q2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_q2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn_clicked(View v) {
        // mit findViewById bekommen wir Zugriff auf das Eingabefeld (EditText-Objekt)
        EditText answerField = (EditText) findViewById(R.id.q2answerView);
        String answerText = answerField.getText().toString();
        String rightAnswer = getString(R.string.q2_right_answer);
        boolean correct = answerText.trim().toLowerCase().equals(rightAnswer.trim().toLowerCase());
        Helper.feedback(correct, 1, this);
    }

}