package TP;

public class AnamnèseEnfant extends QuestionAnamnèse {
    troublesCategorieEnfant categorieEnfant;

    public AnamnèseEnfant(troublesCategorieEnfant trouble, String enoncé, String réponse) {
        énoncé = enoncé;
        this.réponse = réponse;
        categorieEnfant = trouble;
    }
}
