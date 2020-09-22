package com.devrahuls.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class LaunchActivity extends AppCompatActivity {

    RecyclerView questionsListRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        questionsListRV = findViewById(R.id.listQuestions);
        List<String> questions = Arrays.asList(
                "In what town or city was your first full time job?",
                "What is your maternal grandmother's first name?",
                "What is the name of your favorite teacher?",
                "What is the name of your best friend from childhood?",
                "Where did you celebrate New Year's Eve 1999?",
                "What is the first name of your maid of honor at your wedding?",
                "What is the name of your oldest nephew?",
                "What is your favorite movie as a kid?",
                "What is your most memorable meal?",
                "Who is your favorite author?"
        );

        questionsListRV.setAdapter(new SecurityQuestionsAdapter(this,questions));
        questionsListRV.setLayoutManager(new LinearLayoutManager(this));
    }
}