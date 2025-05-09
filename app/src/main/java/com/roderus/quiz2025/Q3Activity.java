package com.roderus.quiz2025;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Q3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_q3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn_clicked(View v){
        // Die erste und die letzte Checkbox müssen "gechecked" sein, alle anderen nicht
        boolean correctAnswer =
                ((CheckBox) findViewById(R.id.q3check1)).isChecked() &&
                        !((CheckBox) findViewById(R.id.q3check2)).isChecked() &&
                        !((CheckBox) findViewById(R.id.q3check3)).isChecked() &&
                        !((CheckBox) findViewById(R.id.q3check4)).isChecked() &&
                        ((CheckBox) findViewById(R.id.q3check5)).isChecked();
        Helper.feedback(correctAnswer,1,this);
    }

}