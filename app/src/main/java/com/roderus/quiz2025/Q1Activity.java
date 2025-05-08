package com.roderus.quiz2025;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Q1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_q1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    /*
     * Die Event-Handling-Methode btn_clicked wird aufgerufen, wenn der Benutzer seine
     * Antwort eingegeben hat. Sie findet heraus, ob die Antwort korrekt ist und
     * gibt diese Information zusammen mit Feedback-Texten weiter an die Feedback-Activity
     */
    public void btn_clicked(View v){
        // mit findViewById bekommen wir das RadioButton-Objekt der korrekten Antwort
        RadioButton rb = findViewById(R.id.radio3);
        /* Die Methode feedback (aus der Klasse Helper) erledigt den Rest:
         * Erzeugen der Feedbacktexte, der Punkte und Aufrufen der Feedback-Activity
         */
        Helper.feedback(rb.isChecked(),1,this);
    }
}