package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainApp extends AppCompatActivity {

    Button practice_btn, quiz_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        practice_btn = findViewById(R.id.startpractice);
        quiz_btn = findViewById(R.id.startquiz);

        practice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainApp.this, Practice.class);
                startActivity(intent);
            }
        });

        quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainApp.this, Quiz.class);
                startActivity(intent);
            }
        });
    }



}