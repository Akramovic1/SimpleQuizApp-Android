package com.example.ahmedakram.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view){
        int correctAnswers = 0;
        String message = "";
        CheckBox questionOnea1 = findViewById(R.id.q1a1);
        CheckBox questionOnea2 = findViewById(R.id.q1a2);
        CheckBox questionOnea3 = findViewById(R.id.q1a3);
        CheckBox questionOnea4 = findViewById(R.id.q1a4);
        RadioButton questionTwo =  findViewById(R.id.q2a2);
        RadioButton questionThree =  findViewById(R.id.q3a1);
        RadioButton questionFour =  findViewById(R.id.q4a2);
        RadioButton questionFive =  findViewById(R.id.q5a1);
        RadioButton questionSix = findViewById(R.id.q6a3);
        RadioButton questionSeven =  findViewById(R.id.q7a2);
        EditText questionEight = findViewById(R.id.q8a1);
        RadioButton questionNine =  findViewById(R.id.q9a2);
        RadioButton questionTen = findViewById(R.id.q10a1);
        if (questionOnea1.isChecked() && questionOnea2.isChecked() && questionOnea4.isChecked() && !questionOnea3.isChecked()){
            correctAnswers += 1;}
        if (questionTwo.isChecked()) {correctAnswers += 1;}
        if (questionThree.isChecked()) {correctAnswers += 1;}
        if (questionFour.isChecked()) {correctAnswers += 1;}
        if (questionFive.isChecked()) {correctAnswers += 1;}
        if (questionSix.isChecked()) {correctAnswers += 1;}
        if(questionSeven.isChecked()){correctAnswers +=1;}
        if(questionEight.getText().toString().toLowerCase().equals("scalene")){correctAnswers +=1;}
        if(questionNine.isChecked()){correctAnswers +=1;}
        if(questionTen.isChecked()){correctAnswers +=1;}
        if(correctAnswers > 9){message = "you are GENIUS!"; }
        else if(correctAnswers > 7){message = "you are semi genius";}
        else if(correctAnswers > 4){message = "you are good";}
        else if (correctAnswers > 0){message = "";}

        Toast.makeText(this, "You got " + correctAnswers*10 + "% " + message, Toast.LENGTH_LONG).show();

    }
}