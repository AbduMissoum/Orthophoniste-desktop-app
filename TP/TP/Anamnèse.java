package TP;

import java.io.Serializable;

public class Anamnèse implements Serializable {
    QuestionAnamnèse[] Questionnaire;

    public Anamnèse(AnamnèseAdulte[] Questionnaire) {
        this.Questionnaire = Questionnaire;
    }

    public Anamnèse(AnamnèseEnfant[] Questionnaire) {
        this.Questionnaire = Questionnaire;
    }
}
