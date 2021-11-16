package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    String[] halqiyah= { "أ","ہ","ح","ع","غ","خ"};
    String[] lahatiyah = {"ق","ک"};
    String[] shajariyah_haafiyah={"ش","ی","ج","ض"};
    String[] tarfiyah ={"ل","ن","ر",};
    String[] nit_eeyah= {"ت","د","ط"};
    String[] lisaveyah = {"ظ","ذ","ث","ص","س","ز"};
    String[] ghunna = {"م","ن", "ف","ب","م","و","باَ","بوُ","بىِ"};

    TextView word, questionno_tv, score_tv;
    Button halqiyah_btn, lahatiyah_btn, shajariyah_haafiyah_btn, tarfiyah_btn, nit_eeyah_btn, lisaveyah_btn, ghunna_btn, next_btn, end_btn;


    int q_no=1;
    int score = 0;

    int correctAnswer = 0;
    boolean user_answer = false;
    Button temp_button;
    boolean answerSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        word = findViewById(R.id.viewtext);
        questionno_tv = findViewById(R.id.questionno);
        score_tv = findViewById(R.id.score);
        word.setText(halqiyah[0]);

        halqiyah_btn =  findViewById(R.id.halqiyahbtn);
        lahatiyah_btn = findViewById(R.id.lahatiyahbtn);
        shajariyah_haafiyah_btn = findViewById(R.id.shajariyahbtn);
        tarfiyah_btn= findViewById(R.id.tarfiyahbtn);
        nit_eeyah_btn=findViewById(R.id.niteeyahbtn);
        lisaveyah_btn=findViewById(R.id.lisaveyahbtn);
        ghunna_btn = findViewById(R.id.ghunnabtn);
        next_btn = findViewById(R.id.nextbtn);
        end_btn = findViewById(R.id.endquizbtn);

        halqiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(halqiyah_btn);
                }
            }
        });

        lahatiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(lahatiyah_btn);
                }
            }
        });

        shajariyah_haafiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(shajariyah_haafiyah_btn);
                }
            }
        });

        tarfiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(tarfiyah_btn);
                }
            }
        });

        nit_eeyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(nit_eeyah_btn);
                }
            }
        });

        lisaveyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(lisaveyah_btn);
                }
            }
        });

        ghunna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerSelected)
                {
                    Toast.makeText(Quiz.this, "Answer Already Selected!", Toast.LENGTH_SHORT).show();
                } else {
                    getAnswer(correctAnswer, getResources().getResourceEntryName(v.getId()));
                    displayAnswer(ghunna_btn);
                }
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answerSelected)
                {
                    Toast.makeText(Quiz.this, "You can't skip question", Toast.LENGTH_SHORT).show();
                }else{
                answerSelected = false;
                temp_button.setBackgroundColor(0xFF5900E4);
                q_no++;
                questionno_tv.setText(Integer.toString(q_no));
                correctAnswer = new Random().nextInt(7) + 0;
                System.out.println(correctAnswer);
                getRandomword(correctAnswer);
                }
            }
        });

        end_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalquestions = questionno_tv.getText().toString();
                String score = score_tv.getText().toString();
                Intent intent = new Intent(Quiz.this, Result.class);
                intent.putExtra("Total_Questions", totalquestions);
                intent.putExtra("Score", score);

                startActivity(intent);
            }
        });

    }

    public void getRandomword(int ran_cate)
    {
        if (ran_cate==0)
        {
            word.setText(halqiyah[new Random().nextInt(halqiyah.length) + 0]);
        }else if(ran_cate==1)
        {
            word.setText(lahatiyah[new Random().nextInt(lahatiyah.length) + 0]);
        }else if(ran_cate==2)
        {
            word.setText(shajariyah_haafiyah[new Random().nextInt(shajariyah_haafiyah.length) + 0]);
        }else if(ran_cate==3)
        {
            word.setText(tarfiyah[new Random().nextInt(tarfiyah.length) + 0]);
        }else if(ran_cate==4)
        {
            word.setText(nit_eeyah[new Random().nextInt(nit_eeyah.length) + 0]);
        }else if(ran_cate==5)
        {
            word.setText(lisaveyah[new Random().nextInt(lisaveyah.length) + 0]);
        }else if(ran_cate==6)
        {
            word.setText(ghunna[new Random().nextInt(ghunna.length) + 0]);
        }
    }

    public void getAnswer(int myans, String userans)
    {
        if(myans==0 && userans.equals("halqiyahbtn"))
        {
            user_answer = true;
        }else if (myans==1 && userans.equals("lahatiyahbtn"))
        {
            user_answer = true;
        }else if (myans==2 && userans.equals("shajariyahbtn"))
        {
            user_answer = true;
        }else if (myans==3 && userans.equals("tarfiyahbtn"))
        {
            user_answer = true;
        }else if (myans==4 && userans.equals("niteeyahbtn"))
        {
            user_answer = true;
        }else if (myans==5 && userans.equals("lisaveyahbtn"))
        {
            user_answer = true;
        }else if (myans==6 && userans.equals("ghunna"))
        {
            user_answer = true;
        }
        else
        {
            user_answer = false;
        }
    }

    public void displayAnswer(Button btn) {
        answerSelected = true;
        temp_button = btn;
        if (user_answer) {
            score++;
            score_tv.setText(Integer.toString(score));
            //Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_LONG).show();
            btn.setBackgroundColor(0xFF1B9D2C);
        }
        else
        {
            btn.setBackgroundColor(0xFFFC4242);
            //Toast.makeText(Quiz.this, "Wrong", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("Word", word.getText().toString());
        savedInstanceState.putString("QuestionNo", questionno_tv.getText().toString());
        savedInstanceState.putString("Score", score_tv.getText().toString());
        savedInstanceState.putInt("Correct", correctAnswer);
        //savedInstanceState.putInt("ButtonColor", temp_button.getBackground());
        //savedInstanceState.putBoolean("AnswerSelected", answerSelected);
        // etc.
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        word.setText(savedInstanceState.getString("Word"));
        questionno_tv.setText(savedInstanceState.getString("QuestionNo"));
        score_tv.setText(savedInstanceState.getString("Score"));
        correctAnswer = savedInstanceState.getInt("Correct");
        //answerSelected = savedInstanceState.getBoolean("AnswerSelected");
    }


}