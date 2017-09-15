package com.example.cathy.truefalsequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        initializeQuestionBank();
        questionText.setText(questionBank.get(0).getQuestionText());
    }


    public void wireWidgets()
    {
        trueButton= (Button) findViewById(R.id.button_true);
        falseButton= (Button) findViewById(R.id.button_false);
        nextButton= (Button) findViewById(R.id.button_next);
        questionText= (TextView) findViewById(R.id.text_question);
    }

    private void setListeners()
    {
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    private void initializeQuestionBank()
    {
        questionBank= new ArrayList<>();
        questionBank.add(new Question(getString(R.string.fruit_question), true));
        questionBank.add(new Question(getString(R.string.ripe_question), false));
        questionBank.add(new Question(getString(R.string.cut_question), false));
        questionBank.add(new Question(getString(R.string.nutritious_question), true));
        questionBank.add(new Question(getString(R.string.pit_question), true));
        questionBank.add(new Question(getString(R.string.dip_question), true));
        questionBank.add(new Question(getString(R.string.peel_question),false));
    }



    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            //else if statements
            case R.id.button_true:

        }
    }
}
