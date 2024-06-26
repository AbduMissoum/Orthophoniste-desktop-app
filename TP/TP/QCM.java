package TP;

import java.util.ArrayList;

public class QCM extends Question {
    protected float noteComplète = 1;
    protected ArrayList<String> choix;
    protected ArrayList<Integer> réponse;
    protected ArrayList<Integer> réponseCorrecte;

    public QCM(String enoncé, ArrayList<String> choix, ArrayList<Integer> réponseCorrecte) {
        this.choix = choix;
        this.réponseCorrecte = réponseCorrecte;
        this.enoncé = enoncé;
    }

    public float calculerScore() {
        if (réponseCorrecte.size() == réponse.size()) {
            for (int reponse : réponse) {
                if (!réponseCorrecte.contains(reponse)) {
                    note = 0;
                    return 0;
                }
            }
            note = noteComplète;
            return noteComplète;
        } else {
            note = 0;
            return 0;
        }
    }

    public void afficher() {
        System.out.println(choix);
        System.out.println(enoncé);
        System.out.println(réponseCorrecte);
    }
}
