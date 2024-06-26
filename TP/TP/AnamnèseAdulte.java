package TP;

public class AnamnèseAdulte extends QuestionAnamnèse {
    troublesCategorieAdulte categorieAdulteTrouble;

    public AnamnèseAdulte(troublesCategorieAdulte trouble, String enoncé, String réponse) {
        énoncé = enoncé;
        this.réponse = réponse;
        categorieAdulteTrouble = trouble;
    }
}
