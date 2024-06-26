package TP;

import java.util.Set;

public class testQuestion extends Test {
    Set<Question> questions;

    public testQuestion() {
    }

    public void AjouterQuestion(Question qst) {
        questions.add(qst);
    }

    public float calculerScore() {
        float score = 0;
        for (Question question : questions) {
            score = score + question.calculerScore();
        }
        return score;
    };

}