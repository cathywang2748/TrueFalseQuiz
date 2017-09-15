package com.example.cathy.truefalsequiz;

/**
 * Created by per6 on 9/15/17.
 */

public class Question
{
    private String questionText;
    private boolean answer;

    public Question(String questionText, Boolean answer)
    {
        this.questionText = questionText;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isAnswer() {
        return answer;
    }

    /**
     * @param userAnswer what the user selected
     * @return true if the answers match, false otherwise
     */
    public boolean checkAnswer(boolean userAnswer)
    {
        //whether or not the supplied answer matches the real answer
        return answer == userAnswer;

    }

}
