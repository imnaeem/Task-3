package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    TextView word;
    String[] halqiyah= { "أ","ہ","ح","ع","غ","خ"};
    String[] lahatiyah = {"ق","ک"};
    String[] shajariyah_haafiyah={"ش","ی","ج","ض"};
    String[] tarfiyah ={"ل","ن","ر",};
    String[] nit_eeyah= {"ت","د","ط"};
    String[] lisaveyah = {"ظ","ذ","ث","ص","س","ز"};
    String[] ghunna = {"م","ن", "ف","ب","م","و","باَ","بوُ","بىِ"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        word = findViewById(R.id.viewtext);

        word.setText(halqiyah[0]);


    }



}