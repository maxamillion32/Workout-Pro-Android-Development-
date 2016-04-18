package com.example.unique.myapplication.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.unique.myapplication.R;

public class MainActivity extends Activity {

    Button btnLogin;
    ImageButton btnHealthTip,btnGworkout,btnGDiet,btnCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        btnLogin =(Button) findViewById(R.id.btnLogin);
        btnHealthTip=(ImageButton) findViewById(R.id.btnHealthTip);
        btnGDiet=(ImageButton) findViewById(R.id.btnGDiet);
        btnGworkout=(ImageButton) findViewById(R.id.btnGWorkout);
        btnCalculator=(ImageButton) findViewById(R.id.btnCalculator);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BMIActivity.class));
            }
        });
        btnHealthTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TipsActivity.class));
            }
        });
        btnGDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BMIActivity.class));
            }
        });
        btnGworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GymExercisesActivity.class));
            }
        });
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),IdealWeightActivity.class));
            }
        });

    }
}
