package com.roderus.quiz2025;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Q5Activity extends AppCompatActivity {

    private NumberPicker nb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_q5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nb = findViewById(R.id.q5numberpicker);
        nb.setMinValue(1);
        nb.setMaxValue(50);
        nb.setValue(1);
    }

    public void btn_clicked(View v){
        Helper.feedback(nb.getValue()==35, 1, this);
    }
}