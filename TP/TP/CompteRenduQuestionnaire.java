
package TP;

public class CompteRenduQuestionnaire extends CompteRendu {
    testQuestion test;

    public CompteRenduQuestionnaire(testQuestion test) {
        this.test = test;
    }

    public void afficherScore() {
        int i = 1;
        for (Question question : test.questions) {
            System.out.println("Le score obtenu dans la question " + i + " est : " + question.note);// a remplacer dans
                                                                                                    // la GUI
        }
        System.out.println("Le score total obtenu est : " + test.score);// a remplacer dans la GUI
    }
}
