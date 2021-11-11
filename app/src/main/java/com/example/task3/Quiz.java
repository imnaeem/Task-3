package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    Button halqiyah_btn, lahatiyah_btn, shajariyah_haafiyah_btn, tarfiyah_btn, nit_eeyah_btn, lisaveyah_btn, ghunna_btn;

    int len = halqiyah.length;

    final int cate = new Random().nextInt(7) + 0;
    boolean user_answer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        halqiyah_btn =  findViewById(R.id.halqiyahbtn);
        lahatiyah_btn = findViewById(R.id.lahatiyahbtn);
        shajariyah_haafiyah_btn = findViewById(R.id.shajariyahbtn);
        tarfiyah_btn= findViewById(R.id.tarfiyahbtn);
        nit_eeyah_btn=findViewById(R.id.niteeyahbtn);
        lisaveyah_btn=findViewById(R.id.lisaveyahbtn);
        ghunna_btn = findViewById(R.id.ghunnabtn);

        halqiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lahatiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        shajariyah_haafiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tarfiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nit_eeyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lisaveyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ghunna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        word = findViewById(R.id.viewtext);

        word.setText(halqiyah[0]);


    }

    public void getRandomword(int ran_cate)
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

    public void getAnswer(int myans, String userans)
    {
        if(myans==0 && userans=="halqiyahbtn")
        {
            user_answer = true;
        }else if (myans==1 && userans=="lahatiyahbtn")
        {
            user_answer = true;
        }else if (myans==2 && userans=="shajariyahbtn")
        {
            user_answer = true;
        }else if (myans==3 && userans=="tarfiyahbtn")
        {
            user_answer = true;
        }else if (myans==4 && userans=="niteeyahbtn")
        {
            user_answer = true;
        }else if (myans==5 && userans=="lisaveyahbtn")
        {
            user_answer = true;
        }else if (myans==6 && userans=="ghunna")
        {
            user_answer = true;
        }
        else
        {
            user_answer = false;
        }
    }

    public void displayAnswer()
    {
        if (user_answer)
        {

        }
    }


}