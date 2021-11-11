package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button repo_btn;
    String url ="https://github.com/imnaeem/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repo_btn = findViewById(R.id.repo);

        repo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage(url);
            }
        });
    }
    
    
    
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new
                Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

}