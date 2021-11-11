package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    TextView word;
    String[] halqiyah= { "أ","ہ","ح","ع","غ","خ"};
    String[] lahatiyah = {"ق","ک"};
    String[] shajariyah_haafiyah={"ش","ی","ج","ض"};
    String[] tarfiyah ={"ل","ن","ر",};
    String[] nit_eeyah= {"ت","د","ط"};
    String[] lisaveyah = {"ظ","ذ","ث","ص","س","ز"};
    String[] ghunna = {"م","ن", "ف","ب","م","و","باَ","بوُ","بىِ"};

    int len = halqiyah.length;

    final int cate = new Random().nextInt(7) + 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        word = findViewById(R.id.viewtext);

        word.setText(halqiyah[0]);


    }

    public void getrandomword(int ran_cate)
    {
        final int ran_word;
        if (ran_cate==0)
        {
            ran_word= new Random().nextInt(halqiyah.length) + 0;
        }else if(ran_cate==1)
        {
            ran_word= new Random().nextInt(lahatiyah.length) + 0;
        }else if(ran_cate==2)
        {
            ran_word= new Random().nextInt(shajariyah_haafiyah.length) + 0;
        }else if(ran_cate==3)
        {
            ran_word= new Random().nextInt(tarfiyah.length) + 0;
        }else if(ran_cate==4)
        {
            ran_word= new Random().nextInt(nit_eeyah.length) + 0;
        }else if(ran_cate==5)
        {
            ran_word= new Random().nextInt(lisaveyah.length) + 0;
        }else if(ran_cate==6)
        {
            ran_word= new Random().nextInt(ghunna.length) + 0;
        }
    }

    public void getanswer()
    {

    }


}