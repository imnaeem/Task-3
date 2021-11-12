package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView t1, t2;
    Button share_btn;



    String tq="0";
    String sc="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1= findViewById(R.id.textView3);
        t2= findViewById(R.id.textView4);
        share_btn = findViewById(R.id.sharebtn);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tq = extras.getString("Total_Questions");
            sc = extras.getString("Score");

            t1.setText(tq);
            t2.setText(sc);
        }

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT,
                        "Quiz Result: \nTotal Question: "+tq+" \nCorrect Answers: "+sc+" ");
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Result.this, MainApp.class);
        startActivity(intent);
    }
}