package TP;

import java.util.ArrayList;

public class QCU extends Question {
    ArrayList<String> choix;
    int réponse;
    int réponseCorrecte;
    protected float noteComplète = 1;

    public QCU(ArrayList<String> choix, int réponseCorrecte, int réponse) {
        this.réponseCorrecte = réponseCorrecte;
        this.réponse = réponse;
        this.choix = choix;
    }

    public float calculerScore() {
        if (réponse == réponseCorrecte) {
            note = noteComplète;
            return noteComplète;
        } else {
            note = 0;
            return 0;
        }
    }
}
