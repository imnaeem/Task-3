package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1= findViewById(R.id.textView3);
        t2= findViewById(R.id.textView4);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tq = extras.getString("Total_Questions");
            String sc = extras.getString("Score");

            t1.setText(tq);
            t2.setText(sc);
        }

    }
}