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

public class FeedbackActivity extends AppCompatActivity {

    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feedback);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Wir benötigen Zugriff auf den Intent, der diese Activity gestartet hat,
        // denn dieser enthält noch weitere Informationen, die wir gleich auslesen werden
        Intent intent = getIntent();
        String feedback = intent.getStringExtra("fb");
        String pointstr = intent.getStringExtra("pstr");
        points = intent.getIntExtra("pts", 0);

        // Die erhaltenen Werte tragen wir in die entsprechenden Views ein
        TextView feedbackView = findViewById(R.id.textViewFeedback);
        feedbackView.setText(feedback);

        TextView pointsView = findViewById(R.id.textViewPoints);
        pointsView.setText(pointstr);

    }

    // Der Back-Button bringt uns wieder zur MainAcitivity zurück und nimmt die aktuellen Punkte mit
    public void back_button_clicked(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("pts", points);
        startActivity(intent);
    }

}